package cn.learn.pattern.command;

public class Light {
	//type用来区分是哪种灯，以便模拟不同的设备
	String type;
	public Light(String type) {
		this.type = type;
	}
	//开灯的动作
	public void on() {
		System.out.println("Light of " + type + " turn on");
	}
	//关灯的动作
	public void off() {
		System.out.println("Light of "+ type + " turn off");
	}
	
}
