package cn.learn.pattern.decorator;

//Mocha����
public class Mocha extends CondimentDecorator{

	Beverage beverage;//��װ����
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Mocha";
	}

	@Override
	public double cost() {
		// ����һ���ǣ���װ���ߵĻ�����Ҳ���ǿ����ˣ���������Macha��Ҫ��Ǯ
		return beverage.cost() + 0.20;
	}

}
