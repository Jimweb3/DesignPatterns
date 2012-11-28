package cn.learn.pattern.strategy;

public class TwoDuck extends Duck{
	
	public TwoDuck() {
		// 初始化第二只鸭子，让这只鸭子不能飞，但它能"squeak"这样叫(就是"吱吱叫"了)
		flyBehavior = new FlyNoWay();
		quackBehavior = new QuackSqueak();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am the tow duck..");
	}
}
