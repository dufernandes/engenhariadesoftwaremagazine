package edu.engsoftmag.designpattern.decorator;

public class CatupiryCheeze extends ExtraCondiment {

	Condiment condiment = null;
	
	public CatupiryCheeze(Condiment condiment) {
		this.condiment = condiment;
	}

	@Override
	public String getDescription() {
		return condiment.getDescription() + ", " + "Catupiry Cheeze";
	}

	@Override
	public double cost() {
		return condiment.cost() + 3d;
	}

}
