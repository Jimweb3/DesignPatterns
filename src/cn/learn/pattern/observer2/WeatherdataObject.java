package cn.learn.pattern.observer2;

import java.util.Observable;

public class WeatherdataObject extends Observable{
	
	//�¶ȣ�ʪ�ȣ�ѹǿ
	private float temperature;
	private float himidity;
	private float pressture;

	//����һ���ı��������ݵķ��������������ʵ���в����ֶ������ݽ��и��ģ����ֻ��ģ��
	public void setWeatherData(float temperature,float himidity,float pressture){
		this.temperature = temperature;
		this.himidity = himidity;
		this.pressture = pressture;
		
		notifyChange();
		
	}
	
	private void notifyChange() {
		//�ı��־λ
		setChanged();
		//֪ͨ�۲���
		notifyObservers();
	}

	//��Ҫ����������ʱ��
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
