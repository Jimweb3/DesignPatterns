package cn.learn.pattern.observer2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,IDisplayElement{
	
	//这个告示板（也就是一个观察者），假设他只对温度，湿度感兴趣。
	private float temperature;
	private float himidity;
	
	//这是一个“可观察的对象”也就是“主题”
	Observable observable;
	
	public CurrentConditionsDisplay(Observable o) {
		this.observable = o;
		this.observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("The temperature is :"+temperature+" and the himidity is :" + himidity);
	}

	@Override
	public void update(Observable o, Object object) {
		if (o instanceof WeatherdataObject) {
			WeatherdataObject weatherdataObject = (WeatherdataObject)o; 
			this.temperature = weatherdataObject.getTemperature();
			this.himidity = weatherdataObject.getHimidity();
			display();
		}
	}
	
	//这儿我添加了从主题中把自己移除，就是不再观察这个主题了
	public void removeMyself() {
		// TODO Auto-generated method stub
		observable.deleteObserver(this);
	}
}
