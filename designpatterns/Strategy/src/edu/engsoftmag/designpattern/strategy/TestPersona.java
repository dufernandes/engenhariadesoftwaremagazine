package edu.engsoftmag.designpattern.strategy;

import edu.engsoftmag.designpattern.strategy.personas.Bear;
import edu.engsoftmag.designpattern.strategy.personas.Man;
import edu.engsoftmag.designpattern.strategy.personas.Monkey;
import edu.engsoftmag.designpattern.strategy.personas.Persona;
import edu.engsoftmag.designpattern.strategy.personas.behavior.DoNotFly;
import edu.engsoftmag.designpattern.strategy.personas.behavior.FlyWithSuperPowers;

public class TestPersona {

	public static void main(String[] args) {
		// instantiate the Personas
		Persona man = new Man("John", new FlyWithSuperPowers());
		Persona bear = new Bear("Beary", new DoNotFly());
		Persona monkey = new Monkey("Monkey Josef", new FlyWithSuperPowers());
		
		// test movements of the Personas
		man.attack();
		bear.defend();
		monkey.defend();
		
		System.out.println("\nTesting fly behavior using the Strategy Desgin Pattern:\n");
		
		// test the fly behavior
		man.talk();
		man.fly();
		System.out.println("\n");
		bear.talk();
		bear.fly();
		System.out.println("\n");
		monkey.talk();
		monkey.fly();
	}

}
