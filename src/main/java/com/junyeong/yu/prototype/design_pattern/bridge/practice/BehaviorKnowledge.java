package com.junyeong.yu.prototype.design_pattern.bridge.practice;

public class BehaviorKnowledge implements BehaviorI {
    @Override
    public void eat(String subject) {
        System.out.println(subject + " Eat knowing");
    }

    @Override
    public void study(String subject) {
        System.out.println(subject + " Study knowing");
    }

    @Override
    public void work(String subject) {
        System.out.println(subject + " Work with knowing");
    }

    @Override
    public void run(String subject) {
        System.out.println(subject + " Run with knowing");
    }
}