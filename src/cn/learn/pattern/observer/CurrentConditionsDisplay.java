package cn.learn.pattern.observer;

public class CurrentConditionsDisplay implements IObserver,DisplayElement {
	
	//�����ʾ�壨Ҳ����һ���۲��ߣ���������ֻ���¶ȣ�ʪ�ȸ���Ȥ��
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
