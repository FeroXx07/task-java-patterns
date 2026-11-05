package singleton;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;

public class Undo {
    // The field must be declared volatile so that double check lock would work
    // correctly.
    private static volatile Undo instance;

    private Undo(){}

    public static Undo getInstance() {
        Undo result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Undo.class) {
            if (instance == null) {
                instance = new Undo();
            }
            return instance;
        }
    }

    private final Deque<String> stack = new ArrayDeque<String>();

    public Collection<String> getStack() {
        return Collections.unmodifiableCollection(stack);
    }

    public void addCommand(String command) {
        stack.push(command);
    }

    public String undoCommand() {
        return stack.pop();
    }

    public void showHistory() {
        stack.descendingIterator()
                .forEachRemaining((e) -> System.out.print(e + ", "));
        System.out.println();
    }
}
