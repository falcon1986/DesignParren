package com.wwq.dp.singeton;

/**
 * 单例 - 饿汉模式（不建议）
 * 
 * @功能描述
 * 		 第一次使用时，才初始化资源
 *       存在线程安全问题
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年6月9日 上午11:25:37
 */
public class LazySingeton01 {
	
	private static LazySingeton01 instance = null;
	
	private LazySingeton01() {
		
	}
	
	public static LazySingeton01 getInstance() {
		if(instance == null) {
			instance = new LazySingeton01();
		}
		
		return instance;
	}
}