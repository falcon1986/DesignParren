package com.wwq.dp.singeton;

/**
 * 单例 - 静态内部类方式实现（推荐）
 * 
 * @功能描述
 *       不存在线程安全问题
 *       由于内部类第一次加载的时候才会初始化，所以可以实现单例效果
 *       由jvm保证对象生成的原子性
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年6月9日 上午11:44:37
 */
public class InnerSingeton {

	private InnerSingeton() {
		
	}
	
	private static class InnerSingetonHandle {
		private static InnerSingeton instance = new InnerSingeton();
	}
	
	public static InnerSingeton getInstance() {
		return InnerSingetonHandle.instance;
	}
}
