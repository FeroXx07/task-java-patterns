package singleton;

import java.util.ArrayDeque;
import java.util.Collection;

public class Undo {
    private static Undo instance;
    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    private final ArrayDeque<String> stack = new ArrayDeque<String>();

    public Collection<String> getStack() {
        return stack.clone();
    }

    public void addCommand(String command) {
        stack.push(command);
    }

    public String undoCommand() {
        return stack.pop();
    }

    public void showHistory() {
        stack.forEach(System.out::println);
    }
}
