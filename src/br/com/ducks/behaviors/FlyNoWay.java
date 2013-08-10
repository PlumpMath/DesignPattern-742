package br.com.ducks.behaviors;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm a bitch. I can't fly!");		
	}

}
