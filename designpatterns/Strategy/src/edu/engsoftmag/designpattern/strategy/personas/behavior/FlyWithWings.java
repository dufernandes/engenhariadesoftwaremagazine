package edu.engsoftmag.designpattern.strategy.personas.behavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I have wings and I can fly.");
	}

}
