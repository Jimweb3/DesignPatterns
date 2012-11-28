package cn.learn.pattern.strategy;

public abstract class Duck {
	
	//����Ѽ�ӵ���Ϊ
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	public abstract void display();
	
	//����Ѽ�ӵ���Ϊ����
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
	
	
	//������ġ��ɡ������С�����Ϊί�и�����Ķ���
	public void preformFly(){
		flyBehavior.fly();
	}
	public void preformQuack(){
		quackBehavior.quack();
	}
	
	//����Ѽ�ӹ��е�һЩ����
	public void swim(){
		System.out.println("all duck can swim~");
	}
	
}
