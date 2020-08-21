package com.wwq.dp.factoryMethod;

public class DogFactory implements AbstractAnimalFactory {

	@Override
	public Animal getAnimal() {
		return new Dog();
	}

}
