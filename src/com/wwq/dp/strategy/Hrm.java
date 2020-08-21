package com.wwq.dp.strategy;

public class Hrm {

	private int height;
	private int weight;
	
	
	public Hrm(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Hrm [height=" + height + ", weight=" + weight + "]";
	}
}
