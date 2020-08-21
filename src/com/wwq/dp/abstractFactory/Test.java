package com.wwq.dp.abstractFactory;

public class Test {

	public static void main(String[] args) {
		AbstractPcFactory factory = new LenovoFactory();
		System.out.println(factory.getDisk().getName());
		System.out.println(factory.getRam().getName());
		
		factory = new DellFactory();
		System.out.println(factory.getDisk().getName());
		System.out.println(factory.getRam().getName());
	}

}
