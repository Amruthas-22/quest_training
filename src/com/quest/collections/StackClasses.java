package com.quest.collections;

import java.util.Stack;

public class StackClasses {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.search(1));
        System.out.println(stack.add(4));
        System.out.println(stack.size());
        System.out.println(stack.get(0));
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
