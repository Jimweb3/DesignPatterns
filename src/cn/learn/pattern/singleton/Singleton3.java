package cn.learn.pattern.singleton;

public class Singleton3 {
	
	//volatile��֤���߳�����ȷ�����һ��ʵ��ʱ���ᷢ���߳�����
	private static volatile Singleton3 instence ;
	
	private Singleton3 () {}
	
	public static synchronized Singleton3 getInstence(){
		if (instence == null) {//��=nullʱ��ͬ����ͬ��ִֻ��һ��
			synchronized (Singleton3.class) {
				if (instence == null) {
					instence = new Singleton3();
				}
			}
		}
		return instence;
	}
	
}
