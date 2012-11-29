package cn.learn.pattern.decorator;

//Mocha调料
public class Mocha extends CondimentDecorator{

	Beverage beverage;//被装饰者
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Mocha";
	}

	@Override
	public double cost() {
		// 花销一共是，被装饰者的花销，也就是咖啡了，加上现在Macha需要的钱
		return beverage.cost() + 0.20;
	}

}
