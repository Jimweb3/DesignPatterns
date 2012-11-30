package cn.learn.pattern.abstractfactory;

//一个具体的工厂,由这个工厂来创建相应的原料
public class NYPizzaIngredientFactory implements IPizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

}
