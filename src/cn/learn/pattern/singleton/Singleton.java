package cn.learn.pattern.singleton;

public class Singleton {

	private static Singleton instence;
	
	private Singleton () {}
	
	//最标准的单例 这个是会有一些问题的，当二个线程同时进入了new Singleton就不能保证唯一性了
	public static Singleton getInstence(){
		if (instence == null) {
			instence = new Singleton();
		}
		return instence;
	}
	
	//解决线程问题，用了synchronized关键字，解决同步，但是占了相当多的资源，因为我们只是为了解决第一次new的时候线程同步的问题，
	//这样每次拿实例都会检查是否同步
	public static synchronized Singleton getInstence1(){
		if (instence == null) {
			instence = new Singleton();
		}
		return instence;
	}


}
