package br.com.ducks;

import br.com.ducks.behaviors.FlyWithWings;
import br.com.ducks.behaviors.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck.");
	}

}
