package cn.learn.pattern.strategy;
//"��"��Ϊ�ľ���ʵ��
public class QuackMute implements QuackBehavior {
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("The duck can not quack..");
	}

}
