package cn.learn.pattern.singleton;

public class Singleton2 {
	
	//解决线程问题，使用急切加载，就是JVM一开始的时候就把这个实例创建出来，
	//后面直接用。但如果这个实例很占用资源，后面一直又没怎么用，资源就浪费了
	private static Singleton2 instence = new Singleton2();
	
	private Singleton2 () {}
	
	public static synchronized Singleton2 getInstence(){
		return instence;
	}
	
}
