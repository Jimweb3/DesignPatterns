package cn.learn.pattern.command;

//这相当于一个空命令，只是用于RemoteControl里面初始化时用
public class NoCommand implements ICommand{
	@Override
	public void execute() {
	}
	@Override
	public void undo() {
	}

}
