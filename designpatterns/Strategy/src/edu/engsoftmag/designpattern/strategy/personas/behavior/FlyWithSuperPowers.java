package edu.engsoftmag.designpattern.strategy.personas.behavior;

public class FlyWithSuperPowers implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Hey, I have super powers and I can fly.");
	}

}
