package cn.learn.pattern.simplecommand;

//�йص��ݴ����ʵ��Command�ӿ�
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
