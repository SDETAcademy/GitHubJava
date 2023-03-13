package day_47;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("Tatsiana");
        myStack.push("Maria");
        myStack.push("Cornelia");
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack);
        System.out.println(myStack.search("Maria"));
        System.out.println(myStack.empty());
    }
}
