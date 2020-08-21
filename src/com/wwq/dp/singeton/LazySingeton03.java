package com.wwq.dp.singeton;

/**
 * 单例 - 饿汉模式（不建议）
 * 
 * @功能描述
 * 		 第一次使用时，才初始化资源
 *       只锁住生成对象代码，还是有可能存在线程安全问题
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年6月9日 上午11:25:37
 */
public class LazySingeton03 {
	
	private static LazySingeton03 instance = null;
	
	private LazySingeton03() {
		
	}
	
	public static LazySingeton03 getInstance() {
		if(instance == null) {
			synchronized(LazySingeton03.class) {
				instance = new LazySingeton03();
			}
		}
		
		return instance;
	}
}