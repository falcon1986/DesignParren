package com.wwq.dp.factoryMethod;

public class Test {

	public static void main(String[] args) {
		new DogFactory().getAnimal().say();
		new CatFactory().getAnimal().say();
	}

}
