package com.wwq.dp.singeton;

/**
 * ���� - ����ģʽ���Ƽ���
 * 
 * @��������
 *       ͨ����̬�������ǰ��ʼ���������̰߳�ȫ���⣬���ü�
 *       ͨ���������ڴ����Ļ��ʼ�����ĵ������ʹ�����ַ�ʽ
 * @���� 
 *       wwq
 * @����ʱ�� 
 *       2020��6��9�� ����11:21:14
 */
public class HungrySingeton {

	private static HungrySingeton instance = new HungrySingeton();
	
	private HungrySingeton() { }
	
	public static HungrySingeton getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(HungrySingeton.getInstance().hashCode());
		}
	}
}