package com.wwq.dp.singeton;

/**
 * ���� - ����ģʽ���Ƚ����ƣ�
 * 
 * @��������
 * 		 ��һ��ʹ��ʱ���ų�ʼ����Դ
 *       DCL ˫�ؼ������
 *       ͨ��volatile������ָ����������
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��6��9�� ����11:25:37
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