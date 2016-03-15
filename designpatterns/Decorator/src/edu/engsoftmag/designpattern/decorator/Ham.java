package edu.engsoftmag.designpattern.decorator;

public class Ham extends ExtraCondiment {

	Condiment condiment = null;
	
	public Ham(Condiment condiment) {
		this.condiment = condiment;
	}

	@Override
	public String getDescription() {
		return condiment.getDescription() + ", " + "Ham";
	}

	@Override
	public double cost() {
		return condiment.cost() + 3d;
	}

}
