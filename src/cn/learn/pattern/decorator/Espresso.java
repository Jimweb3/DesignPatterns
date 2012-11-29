package cn.learn.pattern.decorator;

//����Coffee
public class Espresso extends Beverage{
	public Espresso(){
		description = "Espresso";//�̳���Beverage
	}
	@Override
	public double cost() {
		return 1.99;
	}
}
