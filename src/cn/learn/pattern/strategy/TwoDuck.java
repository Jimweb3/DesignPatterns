package cn.learn.pattern.strategy;

public class TwoDuck extends Duck{
	
	public TwoDuck() {
		// ��ʼ���ڶ�ֻѼ�ӣ�����ֻѼ�Ӳ��ܷɣ�������"squeak"������(����"֨֨��"��)
		flyBehavior = new FlyNoWay();
		quackBehavior = new QuackSqueak();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am the tow duck..");
	}
}
