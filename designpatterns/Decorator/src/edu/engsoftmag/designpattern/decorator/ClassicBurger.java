package edu.engsoftmag.designpattern.decorator;

public class ClassicBurger extends Condiment {

	public ClassicBurger() {
		this.description = "Classic Burger";
	}

	@Override
	public double cost() {
		return 10d;
	}

}
