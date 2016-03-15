package edu.engsoftmag.designpattern.decorator;

public abstract class Condiment {

	protected String description;
	
	public String getDescription() {
		return this.description;
	}

	public abstract double cost();
}
