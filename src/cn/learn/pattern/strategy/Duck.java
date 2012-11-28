package cn.learn.pattern.strategy;

public abstract class Duck {
	
	//定义鸭子的行为
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	public abstract void display();
	
	//设置鸭子的行为属性
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
	
	
	//将具体的“飞”，“叫”等行为委托给具体的对象
	public void preformFly(){
		flyBehavior.fly();
	}
	public void preformQuack(){
		quackBehavior.quack();
	}
	
	//所有鸭子公有的一些方法
	public void swim(){
		System.out.println("all duck can swim~");
	}
	
}
