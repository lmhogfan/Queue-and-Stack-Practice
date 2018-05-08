package com.company;

import java.util.Stack;

public class SimpleStack
{
    public static void main(String[] args)
    {
        SimpleStack simpleStack=new SimpleStack();
        simpleStack.run();
    }
    private void run()
    {
        Stack<String> myStack= new Stack<>();
        myStack.push("One");
        myStack.push("Two");
        myStack.push("Three");
        myStack.push("Four");
        myStack.push("Five");

        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
    }
}
