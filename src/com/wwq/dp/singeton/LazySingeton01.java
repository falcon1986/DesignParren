package com.wwq.dp.singeton;

/**
 * ���� - ����ģʽ�������飩
 * 
 * @��������
 * 		 ��һ��ʹ��ʱ���ų�ʼ����Դ
 *       �����̰߳�ȫ����
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��6��9�� ����11:25:37
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