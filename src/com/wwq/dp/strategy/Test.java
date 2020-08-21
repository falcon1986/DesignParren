package com.wwq.dp.strategy;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Hrm> hrms = new ArrayList<Hrm>();
		hrms.add(new Hrm(1, 8));
		hrms.add(new Hrm(6, 3));
		hrms.add(new Hrm(7, 5));

		new Sorter<Hrm>().sort(hrms, new WeightSortStrategy());
		
		for (int i = 0; i < hrms.size(); i++) {
			System.out.println(hrms.get(i));
		}
	}

}
