package com.wwq.dp.singeton;

/**
 * ���� - ����ģʽ�������飩
 * 
 * @��������
 * 		 ��һ��ʹ��ʱ���ų�ʼ����Դ
 *       DCL ˫�ؼ������
 *       ����ָ�����ŵ����⣬new��������������ֳ�3��ָ��ִ�CPUΪ���Ż�ָ��ִ�е����ܣ��ڲ�Ӱ�쵥�߳������������п��ܸı�ָ���ִ��˳��
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��6��9�� ����11:25:37
 */
public class LazySingeton04 {
	
	private static LazySingeton04 instance = null;
	
	private LazySingeton04() {
		
	}
	
	public static LazySingeton04 getInstance() {
		if(instance == null) {
			synchronized(LazySingeton04.class) {
				if(instance == null) {
					instance = new LazySingeton04();
				}
			}
		}
		
		return instance;
	}
}