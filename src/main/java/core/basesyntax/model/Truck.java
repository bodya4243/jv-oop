package core.basesyntax.model;

import core.basesyntax.Machine;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck has started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has stopped working");
    }
}