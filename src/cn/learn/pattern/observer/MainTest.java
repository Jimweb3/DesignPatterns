package cn.learn.pattern.observer;

public class MainTest {
	public static void main(String[] args) {
		WeatherDataSubject subject = new WeatherDataSubject();
		//初始化一个观察者，并“注册”到WeatherDataSubject里（是在CurrentConditionsDisplay的构造方法里注册的）
		CurrentConditionsDisplay observer = new CurrentConditionsDisplay(subject);
		//observer.display();
		//模拟主题的数据发生变化，当数据变化时，会打印出当前的数据
		subject.setWeatherData(12.1f, 12.333f, 15.3f);
	}
}
