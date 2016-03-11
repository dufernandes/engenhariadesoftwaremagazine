package edu.engsoftmag.designpattern.strategy.personas;

import edu.engsoftmag.designpattern.strategy.personas.behavior.FlyBehavior;

public class Monkey extends Persona {
	
	private String name = null;
	
	public Monkey(String name, FlyBehavior flyBehavior) {
		super(flyBehavior);
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println(String.format("Monkey %s is attacking.", name));
	}

	@Override
	public void defend() {
		System.out.println(String.format("Monkey %s is defending himself.", name));
	}

	@Override
	public void talk() {
		System.out.println(String.format("Monkey %s is talking.", name));
	}

	@Override
	public void purchaseItem() {
		System.out.println(String.format("Monkey %s is purchasing an item.", name));
	}

}
