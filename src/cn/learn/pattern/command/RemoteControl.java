package cn.learn.pattern.command;

//�����������������ƶ���豸�Ŀ�����
public class RemoteControl {
	
	ICommand[] onCommands;
	ICommand[] offCommands;
	
	public RemoteControl() {
		onCommands = new ICommand[2];
		offCommands = new ICommand[2];
		//��һ���ն���
		ICommand noCommand = new NoCommand();
		for (int i = 0; i < onCommands.length; i++) {
			//����������ȶ����óɿն���
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	//Ϊÿ����۰�����
	public void setCommand(int slot, ICommand onCommand, ICommand offCommand) { 
	    onCommands[slot] = onCommand; 
	    offCommands[slot] = offCommand; 
	} 
	
	public void onButtonPress(int slot) {
		if (onCommands[slot] instanceof NoCommand) {
			System.out.println("������û�а�豸��on����ʧ��");
		} else {
			onCommands[slot].execute();
		}
	}
	
	public void offButtonPress(int slot) {
		if (offCommands[slot] instanceof NoCommand) {
			System.out.println("������û�а�豸��off����ʧ�ܣ�");
		} else {
			offCommands[slot].execute();
		}
	}
	
	
	
	
}
