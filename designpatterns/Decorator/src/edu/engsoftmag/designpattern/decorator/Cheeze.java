package edu.engsoftmag.designpattern.decorator;

public class Cheeze extends ExtraCondiment {

	Condiment condiment = null;
	
	public Cheeze(Condiment condiment) {
		this.condiment = condiment;
	}

	@Override
	public String getDescription() {
		return condiment.getDescription() + ", " + "Cheeze";
	}

	@Override
	public double cost() {
		return condiment.cost() + 3d;
	}

}
