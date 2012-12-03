package cn.learn.pattern.command;

public class LightOnCommand implements ICommand{
	Light light;
	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		this.light.on();
	}
	@Override
	public void undo() {
		//对于开灯的命令，撤销操作当然就是关灯了
		this.light.off();
	}
}
