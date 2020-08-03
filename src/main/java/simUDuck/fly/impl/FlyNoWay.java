package simUDuck.fly.impl;

import simUDuck.fly.FlyBehavior;

/**
 * Flying behavior implementation for ducks that DO NOT fly
 * (like rubber ducks and decoy ducks
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}
