package cn.learn.pattern.simplefactory;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		//由不同的类别先创建不同的pizza
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		}
		if ("clam".equals(type)) {
			pizza = new ClamPizza();
		}
		if ("veggie".equals(type)) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}

}
