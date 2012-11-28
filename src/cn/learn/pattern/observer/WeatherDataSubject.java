package cn.learn.pattern.observer;

import java.util.ArrayList;

//具体的一个主题
public class WeatherDataSubject implements ISubjcet{
	
	//列表用于装观察者
	private ArrayList<IObserver> list;
	
	//温度，湿度，压强
	private float temperature;
	private float himidity;
	private float pressture;
	
	public WeatherDataSubject(){
		list = new ArrayList<IObserver>();
	}
	
	@Override
	public void registerObserver(IObserver o) {
		// TODO Auto-generated method stub
		list.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		// TODO Auto-generated method stub
		if (list!=null && list.size()>0) {
			list.remove(o);
		}
	}

	//通知
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i <list.size(); i++) {
			IObserver observer = list.get(i);
			observer.update(temperature,himidity, pressture);
		}
	}
	
	//定义一个改变主题数据的方法，这个方法在实际中不是手动对数据进行更改，这儿只是模拟
	public void setWeatherData(float temperature,float himidity,float pressture){
		this.temperature = temperature;
		this.himidity = himidity;
		this.pressture = pressture;
	}
	
	

}
