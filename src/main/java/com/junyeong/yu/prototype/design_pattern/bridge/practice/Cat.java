package com.junyeong.yu.prototype.design_pattern.bridge.practice;

public class Cat extends AnimalA {
    private final String CAT = "Cat";
    public Cat(BehaviorI behavior) {
        setBehavior(behavior);
    }
    @Override
    public void eat() {
        behavior.eat(CAT);
    }

    @Override
    public void study() {
        behavior.study(CAT);
    }

    @Override
    public void work() {
        behavior.work(CAT);
    }

    @Override
    public void run() {
        behavior.run(CAT);
    }
}
