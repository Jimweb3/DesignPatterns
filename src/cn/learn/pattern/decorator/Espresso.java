package cn.learn.pattern.decorator;

//…Ó≈‡Coffee
public class Espresso extends Beverage{
	public Espresso(){
		description = "Espresso";//ºÃ≥–÷¡Beverage
	}
	@Override
	public double cost() {
		return 1.99;
	}
}
