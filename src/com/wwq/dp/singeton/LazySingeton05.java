package com.wwq.dp.singeton;

/**
 * 单例 - 饿汉模式（比较完善）
 * 
 * @功能描述
 * 		 第一次使用时，才初始化资源
 *       DCL 双重检查锁定
 *       通过volatile避免了指令重排问题
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年6月9日 上午11:25:37
 */
public class LazySingeton05 {
	
	private static volatile LazySingeton05 instance = null;
	
	private LazySingeton05() {
		
	}
	
	public static LazySingeton05 getInstance() {
		if(instance == null) {
			synchronized(LazySingeton05.class) {
				if(instance == null) {
					instance = new LazySingeton05();
				}
			}
		}
		
		return instance;
	}
}