package cn.learn.pattern.strategy;

//���ɡ�����Ϊ�ľ���ʵ��
public class FlyNoWay implements FlyBehavior{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("The duck can not fly..");
	}
}
