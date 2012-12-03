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
		//���ڿ��Ƶ��������������Ȼ���ǹص���
		this.light.off();
	}
}
