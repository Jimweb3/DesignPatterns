package cn.learn.pattern.simplecommand;

public class SimpleRemoteContrl {
	
	ICommand slot;//����
	
	//��������
	public void setCommand(ICommand command) {
		slot = command;
	}
	
	//���¿��ص�ʱ��ִ������
	public void btnPress(){
		slot.execute();
	}
	
}
