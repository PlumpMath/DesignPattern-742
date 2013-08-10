package br.com.main;

import br.com.ducks.Duck;
import br.com.ducks.MallardDuck;
import br.com.ducks.ModelDuck;
import br.com.ducks.behaviors.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck mutant = new ModelDuck();
		mutant.performFly();
		mutant.performQuack();
		mutant.setFlyBehavior(new FlyRocketPowered());
		mutant.performFly();
	}
}
