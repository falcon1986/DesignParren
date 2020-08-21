package com.wwq.dp.singeton;

/**
 * ���� - ����ģʽ�������飩
 * 
 * @��������
 * 		 ��һ��ʹ��ʱ���ų�ʼ����Դ
 *       ֻ��ס���ɶ�����룬�����п��ܴ����̰߳�ȫ����
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��6��9�� ����11:25:37
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