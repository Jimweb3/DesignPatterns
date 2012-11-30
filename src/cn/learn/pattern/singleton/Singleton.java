package cn.learn.pattern.singleton;

public class Singleton {

	private static Singleton instence;
	
	private Singleton () {}
	
	//���׼�ĵ��� ����ǻ���һЩ����ģ��������߳�ͬʱ������new Singleton�Ͳ��ܱ�֤Ψһ����
	public static Singleton getInstence(){
		if (instence == null) {
			instence = new Singleton();
		}
		return instence;
	}
	
	//����߳����⣬����synchronized�ؼ��֣����ͬ��������ռ���൱�����Դ����Ϊ����ֻ��Ϊ�˽����һ��new��ʱ���߳�ͬ�������⣬
	//����ÿ����ʵ���������Ƿ�ͬ��
	public static synchronized Singleton getInstence1(){
		if (instence == null) {
			instence = new Singleton();
		}
		return instence;
	}


}
