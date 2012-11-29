package cn.learn.pattern.observer;

public class MainTest {
	public static void main(String[] args) {
		WeatherDataSubject subject = new WeatherDataSubject();
		//��ʼ��һ���۲��ߣ�����ע�ᡱ��WeatherDataSubject�����CurrentConditionsDisplay�Ĺ��췽����ע��ģ�
		CurrentConditionsDisplay observer = new CurrentConditionsDisplay(subject);
		//observer.display();
		//ģ����������ݷ����仯�������ݱ仯ʱ�����ӡ����ǰ������
		subject.setWeatherData(12.1f, 12.333f, 15.3f);
	}
}
