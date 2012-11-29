package cn.learn.pattern.observer;

public class CurrentConditionsDisplay implements IObserver,DisplayElement {
	
	//�����ʾ�壨Ҳ����һ���۲��ߣ���������ֻ���¶ȣ�ʪ�ȸ���Ȥ��
	private float temperature;
	private float himidity;
	private WeatherDataSubject subject;
	
	public CurrentConditionsDisplay(WeatherDataSubject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	
	@Override
	public void display() {
		System.out.println("The temperature is :"+temperature+" and the himidity is :" + himidity);
	}

	@Override
	public void update(float temperature, float himidity, float pressture) {
		this.temperature = temperature;
		this.himidity = himidity;
		display();
	}
	
	
	


}
