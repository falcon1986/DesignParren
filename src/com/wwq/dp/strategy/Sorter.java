package com.wwq.dp.strategy;

import java.util.List;

public class Sorter<T> {

	public void sort(List<T> list, SortStrategy<T> strategy) {
		for(int i = 0; i < list.size(); i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(strategy.sort(list.get(i), list.get(j)) > 0) {
					swap(list, i, j);
				}
			}
		}
	}

	private void swap(List<T> list, int i, int j) {
		T temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	
}
