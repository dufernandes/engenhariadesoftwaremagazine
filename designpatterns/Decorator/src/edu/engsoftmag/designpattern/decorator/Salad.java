package edu.engsoftmag.designpattern.decorator;

public class Salad extends ExtraCondiment {

	Condiment condiment = null;
	
	public Salad(Condiment condiment) {
		this.condiment = condiment;
	}

	@Override
	public String getDescription() {
		return condiment.getDescription() + ", " + "Salad";
	}

	@Override
	public double cost() {
		return condiment.cost() + 3d;
	}

}
