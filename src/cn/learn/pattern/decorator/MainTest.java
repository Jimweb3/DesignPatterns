package cn.learn.pattern.decorator;

public class MainTest {

	public static void main(String[] args) {
		
		//��һ��Espresso coffee ʲô��û�м�
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		
		//��һ��House blend coffee 
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);//��mochaװ��
		beverage2 = new Mocha(beverage2);//˫��mocha
		beverage2 = new Whip(beverage2);//��Whipװ��
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		
	}

}
