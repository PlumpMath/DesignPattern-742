package br.com.ducks.behaviors;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack, die fucker!");		
	}

}
