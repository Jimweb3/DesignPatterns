package cn.learn.pattern.observer;

import java.util.ArrayList;

//�����һ������
public class WeatherDataSubject implements ISubjcet{
	
	//�б�����װ�۲���
	private ArrayList<IObserver> list;
	
	//�¶ȣ�ʪ�ȣ�ѹǿ
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

	//֪ͨ
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i <list.size(); i++) {
			IObserver observer = list.get(i);
			observer.update(temperature,himidity, pressture);
		}
	}
	
	//����һ���ı��������ݵķ��������������ʵ���в����ֶ������ݽ��и��ģ����ֻ��ģ��
	public void setWeatherData(float temperature,float himidity,float pressture){
		this.temperature = temperature;
		this.himidity = himidity;
		this.pressture = pressture;
	}
	
	

}
