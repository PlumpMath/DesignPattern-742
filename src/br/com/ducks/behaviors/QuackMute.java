package br.com.ducks.behaviors;

public class QuackMute implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("<< Silence >>");

	}
}
