package cn.learn.pattern.singleton;

public class Singleton3 {
	
	//volatile保证了线程能正确处理第一次实例时不会发生线程问题
	private static volatile Singleton3 instence ;
	
	private Singleton3 () {}
	
	public static synchronized Singleton3 getInstence(){
		if (instence == null) {//当=null时才同步，同步只执行一次
			synchronized (Singleton3.class) {
				if (instence == null) {
					instence = new Singleton3();
				}
			}
		}
		return instence;
	}
	
}
