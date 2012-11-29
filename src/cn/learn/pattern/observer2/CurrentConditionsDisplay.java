package cn.learn.pattern.observer2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,IDisplayElement{
	
	//�����ʾ�壨Ҳ����һ���۲��ߣ���������ֻ���¶ȣ�ʪ�ȸ���Ȥ��
	private float temperature;
	private float himidity;
	
	//����һ�����ɹ۲�Ķ���Ҳ���ǡ����⡱
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
	
	//���������˴������а��Լ��Ƴ������ǲ��ٹ۲����������
	public void removeMyself() {
		// TODO Auto-generated method stub
		observable.deleteObserver(this);
	}
}
