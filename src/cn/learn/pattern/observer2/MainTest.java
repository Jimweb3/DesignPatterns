package cn.learn.pattern.observer2;

public class MainTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherdataObject weatherdataObject = new WeatherdataObject();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherdataObject);
		//�ı����ݣ������۲��߻��ӡ������
		weatherdataObject.setWeatherData(11.1f, 12.5f, 1112.9f);
		
		System.out.println("ɾ���۲��ߺ�");
		//ȡ��ע��
		currentConditionsDisplay.removeMyself();
		//�ı����ݺ󣬹۲���û��ɶ��Ӧ��
		weatherdataObject.setWeatherData(66.1f, 77.5f, 88.9f);

	}
}
