package level1.exercise1;

import java.util.Stack;

public class Undo {
    private static Undo instance;
    private Stack<String> orders;

    Undo() {
        orders = new Stack<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public Stack<String> getOrders() {
        return orders;
    }

    public void setOrders(Stack<String> orders) {
        this.orders = orders;
    }

    public void addCommand(String command) {
        if (command != null && !command.isEmpty()) {
            orders.push(command);
            System.out.println("Command executed!");
        }
    }

    public String undoCommand() {
        if (!orders.isEmpty()) {
            System.out.println("Command Undo!");
            return orders.pop();
        }
        throw new IllegalStateException("No commands to Undo");
    }

    public void showHistory() {
        if (!orders.isEmpty()) {
            String result = String.join(", ", orders);
            //String result2 = orders.stream().collect(Collectors.joining(", "));
            System.out.println(result);
            //System.out.println("-----------------------");
            //System.out.println(result2);
        } else {
            System.out.println("No commands in history");
        }
    }

    public void clearHistory() {
        orders.clear();
    }
}
