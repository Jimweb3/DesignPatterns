package cn.learn.pattern.observer2;

public class MainTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherdataObject weatherdataObject = new WeatherdataObject();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherdataObject);
		//改变数据，这会儿观察者会打印出数据
		weatherdataObject.setWeatherData(11.1f, 12.5f, 1112.9f);
		
		System.out.println("删除观察者后：");
		//取消注册
		currentConditionsDisplay.removeMyself();
		//改变数据后，观察者没有啥反应了
		weatherdataObject.setWeatherData(66.1f, 77.5f, 88.9f);

	}
}
