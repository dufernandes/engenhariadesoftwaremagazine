package edu.engsoftmag.designpattern.decorator;

public class Egg extends ExtraCondiment {

	Condiment condiment = null;
	
	public Egg(Condiment condiment) {
		this.condiment = condiment;
	}

	@Override
	public String getDescription() {
		return condiment.getDescription() + ", " + "Egg";
	}

	@Override
	public double cost() {
		return condiment.cost() + 3d;
	}

}
