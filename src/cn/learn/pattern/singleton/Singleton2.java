package cn.learn.pattern.singleton;

public class Singleton2 {
	
	//����߳����⣬ʹ�ü��м��أ�����JVMһ��ʼ��ʱ��Ͱ����ʵ������������
	//����ֱ���á���������ʵ����ռ����Դ������һֱ��û��ô�ã���Դ���˷���
	private static Singleton2 instence = new Singleton2();
	
	private Singleton2 () {}
	
	public static synchronized Singleton2 getInstence(){
		return instence;
	}
	
}
