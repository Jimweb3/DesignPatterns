package cn.learn.pattern.strategy;

//一只鸭子
public class OneDuck extends Duck{
	
	public OneDuck() {
		//初始化这只鸭子的时候让它有一些特征：这只鸭子能飞(flyWithWings)，不能“叫”(quackMute)
		flyBehavior = new FlyWithWings();
		quackBehavior = new QuackMute();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am the one duck.");
	}
	
}
