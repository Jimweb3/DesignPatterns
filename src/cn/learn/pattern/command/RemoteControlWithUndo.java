package cn.learn.pattern.command;

//���г������ܵĿ�����
public class RemoteControlWithUndo {
	
	ICommand[] onCommands;
	ICommand[] offCommands;
	
	ICommand undoCommand;
	
	public RemoteControlWithUndo() {
		onCommands = new ICommand[2];
		offCommands = new ICommand[2];
		//��һ���ն��������һ�����ɣ�ʵ����һ��������ѳ�ʼ�������(Ҳ����������)��ʼ��NoCommand
		ICommand noCommand = new NoCommand();
		for (int i = 0; i < onCommands.length; i++) {
			//����������ȶ����óɿն���
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	//Ϊÿ����۰�����
	public void setCommand(int slot, ICommand onCommand, ICommand offCommand) { 
	    onCommands[slot] = onCommand; 
	    offCommands[slot] = offCommand; 
	} 
	
	public void onButtonPress(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];//��¼�������� 
	}
	
	public void offButtonPress(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	//����
	public void undoButtonPress() {
		undoCommand.undo();
	}
	
}
