package singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

class UndoTest {

    @BeforeEach
    void emptySingletonStack(){
        Undo instance = Undo.getInstance();

        while(!instance.getStack().isEmpty()){
            instance.undoCommand();
        }

        assertThat(instance.getStack()).isEmpty();
    }

    @Test
    void shouldBeSingleton() {
        Undo instance1 = Undo.getInstance();
        Undo instance2 = Undo.getInstance();
        assertThat(instance1).isSameAs(instance2);
        assertThat(instance1).isEqualTo(instance2);
    }

    @Test
    void shouldIncreaseInAdd() {
        Undo instance = Undo.getInstance();
        instance.addCommand("mkdir carpeta");
        assertThat(instance.getStack().size()).isEqualTo(1);
        instance.addCommand("mkdir carpeta");
        assertThat(instance.getStack().size()).isEqualTo(2);
    }

    @Test
    void shouldBeEmptyAtStart() {
        Undo instance = Undo.getInstance();
        assertThat(instance.getStack().size()).isEqualTo(0);
    }

    @Test
    void shouldDecreaseInUndo() {
        Undo instance = Undo.getInstance();
        instance.addCommand("mkdir carpeta");
        instance.undoCommand();
        assertThat(instance.getStack().size()).isEqualTo(0);
    }

    @Test
    void shouldUndoExpectedCommand(){
        Undo instance = Undo.getInstance();
        instance.addCommand("mkdir carpeta");
        instance.addCommand("cd desktop");
        String undoneCommand = instance.undoCommand();
        assertThat(undoneCommand).isEqualTo("cd desktop");
    }

    @Test
    void shouldHaveCorrectInsertOrder() {
        Undo instance = Undo.getInstance();
        instance.addCommand("command_1");
        instance.addCommand("command_2");
        instance.addCommand("command_3");

        Collection<String> stack = instance.getStack();
        assertThat(stack).containsExactly("command_3", "command_2", "command_1");
    }

    @Test
    void shouldHaveCorrectRemoveOrder() {
        Undo instance = Undo.getInstance();
        instance.addCommand("command_1");
        instance.addCommand("command_2");
        instance.addCommand("command_3");
        instance.undoCommand();

        Collection<String> stack = instance.getStack();
        assertThat(stack).containsExactly("command_2", "command_1");
    }

    @Test
    void shouldDoExpectedBehavior() {
        Undo instance = Undo.getInstance();
        instance.addCommand("command_1");
        instance.addCommand("command_2");

        instance.undoCommand();

        instance.addCommand("command_3");
        instance.addCommand("command_4");
        instance.addCommand("command_5");

        instance.undoCommand();
        instance.undoCommand();

        instance.addCommand("command_6");

        assertThat(instance.getStack()).containsExactly("command_6", "command_3", "command_1");

        instance.undoCommand();
        instance.undoCommand();
        instance.undoCommand();

        assertThat(instance.getStack()).isEmpty();
    }
}