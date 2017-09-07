package com.junyeong.yu.prototype.design_pattern.bridge.practice;

import java.util.ArrayList;
import java.util.List;

public class AnimalBridgeDemo {
    public static void main(String[] args) {
        List<AnimalA> animalList = new ArrayList<>();
        animalList.add(new Cat(new BehaviorFood()));
        animalList.add(new Cat(new BehaviorKnowledge()));
        animalList.add(new Dog(new BehaviorFood()));
        animalList.add(new Dog(new BehaviorKnowledge()));

        animalList.forEach((v) -> {
            v.eat();
            v.study();
            v.work();
            v.run();
            System.out.println("===============");
        });
    }
}
