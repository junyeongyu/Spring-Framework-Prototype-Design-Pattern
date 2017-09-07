package com.junyeong.yu.prototype.design_pattern.bridge.practice;

public class BehaviorFood implements BehaviorI {
    @Override
    public void eat(String subject) {
        System.out.println(subject + " Eat food");
    }

    @Override
    public void study(String subject) {
        System.out.println(subject + " Study food");
    }

    @Override
    public void work(String subject) {
        System.out.println(subject + " Work for food");
    }

    @Override
    public void run(String subject) {
        System.out.println(subject + " Run for food");
    }
}
