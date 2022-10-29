package com.bridgelabz.stackqueue;

import java.util.Stack;

public class StackQueue {
    public void stack() {
        System.out.println("Stack");
        System.out.println();
        Stack<Integer> stack = new Stack<>();

        //UC1=Ability to create a Stack of 56->30->70
        stack.push(56);
        stack.push(30);
        stack.push(70);

        System.out.println("Stack = " +stack);
        System.out.println();
        System.out.println("**Stack Elements**");
    }
    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        stackQueue.stack();
    }

}
