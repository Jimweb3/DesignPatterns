package cn.learn.pattern.adapter;

public class WildTurkey implements ITurkey{
	@Override
	public void gobble() {
		System.out.println("火鸡咯咯叫");
	}
	@Override
	public void fly() {
		System.out.println("我也能飞，但飞一小段");
	}
}
