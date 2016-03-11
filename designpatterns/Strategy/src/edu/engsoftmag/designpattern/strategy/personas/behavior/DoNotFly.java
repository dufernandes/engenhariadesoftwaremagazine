package edu.engsoftmag.designpattern.strategy.personas.behavior;

public class DoNotFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Fly will not happen for me, unfortunately.");
	}

}
