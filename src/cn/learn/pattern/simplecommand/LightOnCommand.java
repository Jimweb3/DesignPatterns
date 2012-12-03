package cn.learn.pattern.simplecommand;

//有关灯泡打开命令，实现Command接口
public class LightOnCommand implements ICommand{
	
	Light light;
	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		this.light.on();
	}
}
