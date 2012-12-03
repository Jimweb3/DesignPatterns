package cn.learn.pattern.simplecommand;

public class SimpleRemoteContrl {
	
	ICommand slot;//命令
	
	//设置命令
	public void setCommand(ICommand command) {
		slot = command;
	}
	
	//按下开关的时候，执行命令
	public void btnPress(){
		slot.execute();
	}
	
}
