import java.util.ArrayList;
import java.util.EmptyStackException;
class Stack<T> {
    private ArrayList<T> elements = new ArrayList<>();
    public void push(T item) {
        elements.add(item);
    }
    public T pop() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }
    public T peek() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }
    public boolean isEmpty() {
        return elements.isEmpty();
    }
    public int size() {
        return elements.size();
    }
}


public class genericStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Top: " + stack.peek());
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Error: Cannot pop from an empty stack!");
        }
    }
}
