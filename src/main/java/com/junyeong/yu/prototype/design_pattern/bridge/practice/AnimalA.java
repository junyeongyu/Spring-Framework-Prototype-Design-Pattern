package com.junyeong.yu.prototype.design_pattern.bridge.practice;

abstract public class AnimalA {
    protected BehaviorI behavior;
    public void setBehavior(BehaviorI behavior) {
        this.behavior = behavior;
    }

    public abstract void eat();
    public abstract void study();
    public abstract void work();
    public abstract void run();
}
