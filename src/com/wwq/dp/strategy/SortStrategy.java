package com.wwq.dp.strategy;

/**
 * ���Խӿڣ�����ģʽͨ���˽ӿ�ʵ���㷨�Ķ����ԣ�
 * 
 * @��������
 *       ϵͳArrays.sort����Ҳ��ʹ���˲���ģʽ
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��6��9�� ����2:30:27
 */
public interface SortStrategy<T> {

	int sort(T a, T b);
}