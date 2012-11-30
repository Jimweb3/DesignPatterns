package cn.learn.pattern.simplefactory;

public class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	//pizza店中订pizza的方法
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = factory.createPizza(type);//用工厂进行创建pizza，不再在这儿由类别判断然后再new出来了
		//对pizza进行后续的加工：准备原料，烘烤，切块，打包
		pizza.prepeare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
