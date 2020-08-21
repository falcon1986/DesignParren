package com.wwq.dp.singeton;

/**
 * 单例 - 饿汉模式（不建议）
 * 
 * @功能描述
 * 		 第一次使用时，才初始化资源
 *       DCL 双重检查锁定
 *       存在指令重排的问题，new对象操作编译后会拆分成3条指令，现代CPU为了优化指令执行的性能，在不影响单线程语义的情况下有可能改变指令的执行顺序
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年6月9日 上午11:25:37
 */
public class LazySingeton04 {
	
	private static LazySingeton04 instance = null;
	
	private LazySingeton04() {
		
	}
	
	public static LazySingeton04 getInstance() {
		if(instance == null) {
			synchronized(LazySingeton04.class) {
				if(instance == null) {
					instance = new LazySingeton04();
				}
			}
		}
		
		return instance;
	}
}