package cn.learn.pattern.command;

//多命令，就是用命令控制多个设备的控制器
public class RemoteControl {
	
	ICommand[] onCommands;
	ICommand[] offCommands;
	
	public RemoteControl() {
		onCommands = new ICommand[2];
		offCommands = new ICommand[2];
		//做一个空对象
		ICommand noCommand = new NoCommand();
		for (int i = 0; i < onCommands.length; i++) {
			//将命令对象先都设置成空对象
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	//为每个插槽绑定命令
	public void setCommand(int slot, ICommand onCommand, ICommand offCommand) { 
	    onCommands[slot] = onCommand; 
	    offCommands[slot] = offCommand; 
	} 
	
	public void onButtonPress(int slot) {
		if (onCommands[slot] instanceof NoCommand) {
			System.out.println("这个插槽没有邦定设备！on动作失败");
		} else {
			onCommands[slot].execute();
		}
	}
	
	public void offButtonPress(int slot) {
		if (offCommands[slot] instanceof NoCommand) {
			System.out.println("这个插槽没有邦定设备！off动作失败！");
		} else {
			offCommands[slot].execute();
		}
	}
	
	
	
	
}
