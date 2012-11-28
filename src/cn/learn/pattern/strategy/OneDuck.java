package cn.learn.pattern.strategy;

//һֻѼ��
public class OneDuck extends Duck{
	
	public OneDuck() {
		//��ʼ����ֻѼ�ӵ�ʱ��������һЩ��������ֻѼ���ܷ�(flyWithWings)�����ܡ��С�(quackMute)
		flyBehavior = new FlyWithWings();
		quackBehavior = new QuackMute();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am the one duck.");
	}
	
}
