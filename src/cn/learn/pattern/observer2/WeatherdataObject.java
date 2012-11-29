package cn.learn.pattern.observer2;

import java.util.Observable;

public class WeatherdataObject extends Observable{
	
	//温度，湿度，压强
	private float temperature;
	private float himidity;
	private float pressture;

	//定义一个改变主题数据的方法，这个方法在实际中不是手动对数据进行更改，这儿只是模拟
	public void setWeatherData(float temperature,float himidity,float pressture){
		this.temperature = temperature;
		this.himidity = himidity;
		this.pressture = pressture;
		
		notifyChange();
		
	}
	
	private void notifyChange() {
		//改变标志位
		setChanged();
		//通知观察者
		notifyObservers();
	}

	//需要“拉”数据时用
	public float getTemperature() {
		return temperature;
	}
	public float getHimidity() {
		return himidity;
	}
	public float getPressture() {
		return pressture;
	}
	
}
