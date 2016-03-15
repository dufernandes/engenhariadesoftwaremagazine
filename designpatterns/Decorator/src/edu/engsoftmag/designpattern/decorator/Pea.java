package edu.engsoftmag.designpattern.decorator;

public class Pea extends ExtraCondiment {

	Condiment condiment = null;
	
	public Pea(Condiment condiment) {
		this.condiment = condiment;
	}

	@Override
	public String getDescription() {
		return condiment.getDescription() + ", " + "Pea";
	}

	@Override
	public double cost() {
		return condiment.cost() + 3d;
	}

}
