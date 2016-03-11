package edu.engsoftmag.designpattern.strategy.personas;

import edu.engsoftmag.designpattern.strategy.personas.behavior.FlyBehavior;

public abstract class Persona {
	
	private FlyBehavior flybehavior = null;
	
	public Persona(FlyBehavior flyBehavior) {
		this.flybehavior = flyBehavior;
	}
	
	public abstract void attack();
	
	public abstract void defend();
	
	public abstract void talk();
	
	public abstract void purchaseItem();
	
	public void fly() {
		this.flybehavior.fly();
	}

	public FlyBehavior getFlybehavior() {
		return flybehavior;
	}

	public void setFlybehavior(FlyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}
}
