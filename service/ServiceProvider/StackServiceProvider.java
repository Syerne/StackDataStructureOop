package com.blz.datastructure.service.ServiceProvider;

import com.blz.datastructure.service.StackService;
import com.blz.datastructure.utils.Inputs;

public class StackServiceProvider implements StackService {

    int[] myStack = new int[5];
    int top = -1;

    @Override
    public int push() {
        System.out.println("Enter elements for push");
        int elements = Inputs.getIntValue();
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            top++;
            myStack[top] = elements;
        }
        return elements;
    }


    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            myStack[top] = 0;
            top--;
        }
        return myStack[top];


    }

    @Override
    public int display() {
        for (int i = 0; i < myStack.length; i++) {
            System.out.println(myStack[i] + " ");
        }
        return myStack.length;

    }

    private boolean isFull() {
        return (top >= myStack.length);
    }

    private boolean isEmpty() {
        return (top == -1);
    }
}


