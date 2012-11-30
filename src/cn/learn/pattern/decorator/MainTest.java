package cn.learn.pattern.decorator;

public class MainTest {

	public static void main(String[] args) {
		
		//订一杯Espresso coffee 什么都没有加
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		
		//订一杯House blend coffee 
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);//用mocha装饰
		beverage2 = new Mocha(beverage2);//双份mocha
		beverage2 = new Whip(beverage2);//用Whip装饰
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		
	}

}
