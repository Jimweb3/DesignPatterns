package cn.learn.pattern.simplecommand;

public class MainTest {

	public static void main(String[] args) {
		//һ��������(����˵һ��ң����)
		SimpleRemoteContrl remoteContrl = new SimpleRemoteContrl();
		
		//�������ߣ�����Ķ���
		Light light = new Light();
		//������ͱ������߰
		ICommand command = new LightOnCommand(light);
		
		//������ֻ��ִ������������������ʲô����֪����ʵ�֡������������ߡ��͡�������ִ���ߡ�����
		remoteContrl.setCommand(command);
		//���¿������Ŀ���
		remoteContrl.btnPress();
	}
}
