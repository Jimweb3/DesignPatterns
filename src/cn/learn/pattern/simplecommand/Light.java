package cn.learn.pattern.simplecommand;

public class Light {
	//动作最终执行
	public void on() {
		System.out.println("turn on the light");
	}
	public void off() {
		System.out.println("turn off the light");
	}
}
