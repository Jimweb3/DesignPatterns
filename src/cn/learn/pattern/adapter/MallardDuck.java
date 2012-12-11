package cn.learn.pattern.adapter;

//һֻ��ͷѼ
public class MallardDuck implements IDuck{
	@Override
	public void quack() {
		System.out.println("Quack");
	}
	@Override
	public void fly() {
		System.out.println("I am flying!");
	}
}
