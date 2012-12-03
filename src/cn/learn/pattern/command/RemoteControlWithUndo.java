package cn.learn.pattern.command;

//带有撤销功能的控制器
public class RemoteControlWithUndo {
	
	ICommand[] onCommands;
	ICommand[] offCommands;
	
	ICommand undoCommand;
	
	public RemoteControlWithUndo() {
		onCommands = new ICommand[2];
		offCommands = new ICommand[2];
		//做一个空对象，这儿是一个技巧，实现了一个空命令，把初始化的命令集(也就是数组了)初始成NoCommand
		ICommand noCommand = new NoCommand();
		for (int i = 0; i < onCommands.length; i++) {
			//将命令对象先都设置成空对象
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	//为每个插槽绑定命令
	public void setCommand(int slot, ICommand onCommand, ICommand offCommand) { 
	    onCommands[slot] = onCommand; 
	    offCommands[slot] = offCommand; 
	} 
	
	public void onButtonPress(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];//记录操作动作 
	}
	
	public void offButtonPress(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	//撤销
	public void undoButtonPress() {
		undoCommand.undo();
	}
	
}
