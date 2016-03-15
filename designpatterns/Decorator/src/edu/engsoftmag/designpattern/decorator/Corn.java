package edu.engsoftmag.designpattern.decorator;

public class Corn extends ExtraCondiment {

	Condiment condiment = null;
	
	public Corn(Condiment condiment) {
		this.condiment = condiment;
	}

	@Override
	public String getDescription() {
		return condiment.getDescription() + ", " + "Corn";
	}

	@Override
	public double cost() {
		return condiment.cost() + 3d;
	}

}
