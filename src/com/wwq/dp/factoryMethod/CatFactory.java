package com.wwq.dp.factoryMethod;

public class CatFactory implements AbstractAnimalFactory {

	@Override
	public Animal getAnimal() {
		return new Cat();
	}

}
