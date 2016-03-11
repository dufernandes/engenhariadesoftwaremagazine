package edu.engsoftmag.designpattern.strategy.personas.behavior;

public class FlyWithSpell implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I have magic powers and I can fly.");
	}

}
