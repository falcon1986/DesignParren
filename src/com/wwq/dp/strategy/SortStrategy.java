package com.wwq.dp.strategy;

/**
 * 策略接口（策略模式通过此接口实现算法的多样性）
 * 
 * @功能描述
 *       系统Arrays.sort方法也是使用了策略模式
 * @作者 
 *       wwq
 * @创建时间 
 *       2020年6月9日 下午2:30:27
 */
public interface SortStrategy<T> {

	int sort(T a, T b);
}