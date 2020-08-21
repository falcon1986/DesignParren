package com.wwq.dp.factory;

public class AnimalFactory {

	public Animal genDog() {
		return new Dog();
	}
	
	public Animal genCat() {
		return new Cat();
	}
}
