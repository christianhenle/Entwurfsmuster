package Fabrik;

import Pizza.Pizza;

public abstract class Pizzeria
{
	protected abstract Pizza erstellePizza(String element);
	 
	public Pizza bestellePizza(String typ) {
		Pizza pizza = erstellePizza(typ);
		System.out.println("Mache eine " + pizza.getName() + " ");
		pizza.vorbereiten();
		pizza.backen();
		pizza.schneiden();
		pizza.verpacken();
		return pizza;
	}
}
