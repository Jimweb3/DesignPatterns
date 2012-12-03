package cn.learn.pattern.command;

public class MainTest {
	public static void main(String[] args) {
		
		//RemoteControl remoteControl = new RemoteControl();
		
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		//命令和设备进行邦定
		Light light = new Light("living room");
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		Light light1 = new Light("bedroom");
		LightOnCommand lightOnCommand1 = new LightOnCommand(light1);
		LightOffCommand lightOffCommand1 = new LightOffCommand(light1);
		
		
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.setCommand(1, lightOnCommand1, lightOffCommand1);
		
		remoteControl.onButtonPress(0);
		remoteControl.undoButtonPress();
		
		System.out.println("----------");
		
		remoteControl.offButtonPress(1);
		remoteControl.undoButtonPress();
		
		
	}
}
