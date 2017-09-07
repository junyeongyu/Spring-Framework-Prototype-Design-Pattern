package com.junyeong.yu.prototype.design_pattern.bridge.practice;

public class Dog extends AnimalA {
    private String DOG = "Dog";
    public Dog(BehaviorI behavior) {
        setBehavior(behavior);
    }

    @Override
    public void eat() {
        behavior.eat(DOG);
    }

    @Override
    public void study() {
        behavior.study(DOG);
    }

    @Override
    public void work() {
        behavior.work(DOG);
    }

    @Override
    public void run() {
        behavior.run(DOG);
    }
}
