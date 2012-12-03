package cn.learn.pattern.simplecommand;

public class MainTest {

	public static void main(String[] args) {
		//一个控制器(或者说一个遥控器)
		SimpleRemoteContrl remoteContrl = new SimpleRemoteContrl();
		
		//被调用者，具体的东西
		Light light = new Light();
		//将命令和被调用者邦定
		ICommand command = new LightOnCommand(light);
		
		//控制器只是执行命令，至于命令具体是什么，不知道，实现“动作的请求者”和“动作的执行者”解耦
		remoteContrl.setCommand(command);
		//按下控制器的开关
		remoteContrl.btnPress();
	}
}
