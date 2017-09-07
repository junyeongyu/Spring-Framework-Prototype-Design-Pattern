package com.junyeong.yu.prototype.design_pattern.memento;

import java.util.ArrayList;
import java.util.List;

class MementoDemo {
    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<>();

        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        savedStates.add(originator.saveToMemento());
        originator.set("State3");
        // We can request multiple mementos, and choose which one to roll back to.
        savedStates.add(originator.saveToMemento());
        originator.set("State4");

        originator.restoreFromMemento(savedStates.get(0));
    }
}