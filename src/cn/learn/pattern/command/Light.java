package cn.learn.pattern.command;

public class Light {
	//type�������������ֵƣ��Ա�ģ�ⲻͬ���豸
	String type;
	public Light(String type) {
		this.type = type;
	}
	//���ƵĶ���
	public void on() {
		System.out.println("Light of " + type + " turn on");
	}
	//�صƵĶ���
	public void off() {
		System.out.println("Light of "+ type + " turn off");
	}
	
}
