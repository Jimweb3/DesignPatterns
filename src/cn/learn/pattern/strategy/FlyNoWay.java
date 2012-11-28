package cn.learn.pattern.strategy;

//“飞”的行为的具体实现
public class FlyNoWay implements FlyBehavior{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("The duck can not fly..");
	}
}
