package edu.engsoftmag.designpattern.decorator;

public class ChickenBurger extends Condiment {

	public ChickenBurger() {
		this.description = "Chicken Burger";
	}

	@Override
	public double cost() {
		return 10d;
	}

}
