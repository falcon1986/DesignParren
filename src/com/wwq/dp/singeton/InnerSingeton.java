package com.wwq.dp.singeton;

/**
 * ���� - ��̬�ڲ��෽ʽʵ�֣��Ƽ���
 * 
 * @��������
 *       �������̰߳�ȫ����
 *       �����ڲ����һ�μ��ص�ʱ��Ż��ʼ�������Կ���ʵ�ֵ���Ч��
 *       ��jvm��֤�������ɵ�ԭ����
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��6��9�� ����11:44:37
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
