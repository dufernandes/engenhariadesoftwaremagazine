package edu.engsoftmag.designpattern.decorator.test;

import edu.engsoftmag.designpattern.decorator.ChickenBurger;
import edu.engsoftmag.designpattern.decorator.ClassicBurger;
import edu.engsoftmag.designpattern.decorator.Condiment;
import edu.engsoftmag.designpattern.decorator.Egg;
import edu.engsoftmag.designpattern.decorator.Ham;
import edu.engsoftmag.designpattern.decorator.Pea;
import edu.engsoftmag.designpattern.decorator.Salad;

public class DecoratorTest {

	public static final void main(String[] args) {
	
		// create burger using composition
		Condiment classicBurgerWithEggsAndHam = new ClassicBurger();
		classicBurgerWithEggsAndHam = new Egg(classicBurgerWithEggsAndHam);
		classicBurgerWithEggsAndHam = new Ham(classicBurgerWithEggsAndHam);
		
		// print burger info
		System.out.println("This burger is: " + classicBurgerWithEggsAndHam.getDescription() +
							"and it costs: " + classicBurgerWithEggsAndHam.cost());
		
		// create another burger
		Condiment chickenBurgerWithPeaAndSaladAndEgg = new ChickenBurger();
		chickenBurgerWithPeaAndSaladAndEgg = new Pea(chickenBurgerWithPeaAndSaladAndEgg);
		chickenBurgerWithPeaAndSaladAndEgg = new Salad(chickenBurgerWithPeaAndSaladAndEgg);
		chickenBurgerWithPeaAndSaladAndEgg = new Egg(chickenBurgerWithPeaAndSaladAndEgg);
		
		// print burger info
				System.out.println("This burger is: " + chickenBurgerWithPeaAndSaladAndEgg.getDescription() +
									"and it costs: " + chickenBurgerWithPeaAndSaladAndEgg.cost());
	}
}
