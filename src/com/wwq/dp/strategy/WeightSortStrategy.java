package com.wwq.dp.strategy;

public class WeightSortStrategy implements SortStrategy<Hrm> {

	@Override
	public int sort(Hrm a, Hrm b) {
		if(a.getWeight() == b.getWeight()) {
			return 0;
		} else if(a.getWeight() < b.getWeight()) {
			return -1;
		}
		return 1;
	}

}
