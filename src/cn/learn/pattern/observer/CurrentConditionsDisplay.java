package cn.learn.pattern.observer;

public class CurrentConditionsDisplay implements IObserver,DisplayElement {
	
	//这个告示板（也就是一个观察者），假设他只对温度，湿度感兴趣。
	private float temperature;
	private float himidity;
	private WeatherDataSubject subject;
	
	public CurrentConditionsDisplay(WeatherDataSubject subject) {
		this.subject = subject;
	}
	
	
	@Override
	public void display() {
		
	}

	@Override
	public void update(float temperature, float himidity, float pressture) {
				
	}


}
