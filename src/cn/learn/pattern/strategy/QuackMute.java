package cn.learn.pattern.strategy;
//"叫"行为的具体实现
public class QuackMute implements QuackBehavior {
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("The duck can not quack..");
	}

}
