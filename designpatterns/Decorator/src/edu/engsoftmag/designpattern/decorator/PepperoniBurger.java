package edu.engsoftmag.designpattern.decorator;

public class PepperoniBurger extends Condiment {

	public PepperoniBurger() {
		this.description = "Pepperoni Burger";
	}

	@Override
	public double cost() {
		return 10d;
	}

}
