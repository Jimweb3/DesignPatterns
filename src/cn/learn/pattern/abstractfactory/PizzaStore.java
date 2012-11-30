package cn.learn.pattern.abstractfactory;

public abstract class PizzaStore {
	
	//定义做pizza的流程
	public Pizza orderPizza(String type) {
		
		//createPizza从工厂中移回对象中
		Pizza pizza = createPizza(type);
	
		pizza.prepare();
		
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}
	
	//让子类去实现，每个店都能有自己的pizza，而orderpizza保证了做pizza的流程是受到总部来控制的
	abstract Pizza createPizza(String type);
	
}
