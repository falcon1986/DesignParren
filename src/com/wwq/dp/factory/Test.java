package com.wwq.dp.factory;

public class Test {

	public static void main(String[] args) {
		new AnimalFactory().genCat().say();
		new AnimalFactory().genDog().say();
	}

}
