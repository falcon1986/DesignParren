package com.wwq.dp.singeton;

/**
 * ���� - ����ģʽ�������飩
 * 
 * @��������
 * 		 ��һ��ʹ��ʱ���ų�ʼ����Դ
 * 		 �������̰߳�ȫ����
 *       ��ס���������������������⣬�����󲿷ֲ�������Ҫ��������£����뻹��Ҫִ��������
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��6��9�� ����11:25:37
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