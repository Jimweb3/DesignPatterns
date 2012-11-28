package cn.learn.pattern.strategy;

//实现“飞”接口，让飞具体起来，这是用“翅膀”飞
public class FlyWithWings implements FlyBehavior{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Fly with wings..");
	}
}
