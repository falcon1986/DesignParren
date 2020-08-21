package com.wwq.dp.singeton;

/**
 * 单例 - 饿汉模式（不建议）
 * 
 * @功能描述
 * 		 第一次使用时，才初始化资源
 * 		 不存在线程安全问题
 *       锁住整个方法，存在性能问题，后续大部分操作不需要锁的情况下，代码还是要执行锁操作
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年6月9日 上午11:25:37
 */
public class LazySingeton02 {
	
	private static LazySingeton02 instance = null;
	
	private LazySingeton02() {
		
	}
	
	public static synchronized LazySingeton02 getInstance() {
		if(instance == null) {
			instance = new LazySingeton02();
		}
		
		return instance;
	}
}