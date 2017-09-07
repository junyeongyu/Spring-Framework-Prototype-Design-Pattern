package com.junyeong.yu.prototype.design_pattern.bridge;

import java.util.Random;

public class BridgeDisc {
    public static void main(String[] args) {
        final int STACK_ARRAY = 0;
        final int STACK_FIFO = 1;
        final int STACK_HONOI = 2;

        StackArray[] stacks = {new StackArray(), new StackFIFO(), new StackHanoi()};
        StackList stackList = new StackList();
        for (int i = 1, num; i < 15; i++) {
            stacks[STACK_ARRAY].push(i);
            stackList.push(i);
            stacks[STACK_FIFO].push(i);
        }
        Random rn = new Random();
        for (int i = 1, num; i < 15; i++) {
            stacks[STACK_HONOI].push(rn.nextInt(20));
        }
        while (!stacks[STACK_ARRAY].isEmpty()) {
            System.out.print(stacks[STACK_ARRAY].pop() + "  ");
        }
        System.out.println();
        while (!stackList.isEmpty()) {
            System.out.print(stackList.pop() + "  ");
        }
        System.out.println();
        while (!stacks[STACK_FIFO].isEmpty()) {
            System.out.print(stacks[STACK_FIFO].pop() + "  ");
        }
        System.out.println();
        while (!stacks[STACK_HONOI].isEmpty()) {
            System.out.print(stacks[STACK_HONOI].pop() + "  ");
        }
        System.out.println();
        System.out.println("total rejected is "
                + ((StackHanoi) stacks[STACK_HONOI]).reportRejected());
    }
}
