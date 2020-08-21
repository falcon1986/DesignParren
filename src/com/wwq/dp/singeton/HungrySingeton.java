package com.wwq.dp.singeton;

/**
 * 单例 - 饿汉模式（推荐）
 * 
 * @功能描述
 *       通过静态代码块提前初始化对象，无线程安全问题，常用简单
 *       通常不在意内存消耗或初始化消耗的情况下使用这种方式
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年6月9日 上午11:21:14
 */
public class HungrySingeton {

	private static HungrySingeton instance = new HungrySingeton();
	
	private HungrySingeton() { }
	
	public static HungrySingeton getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(HungrySingeton.getInstance().hashCode());
		}
	}
}