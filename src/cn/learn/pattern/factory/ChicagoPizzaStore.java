package cn.learn.pattern.factory;

public class ChicagoPizzaStore extends PizzaStore{
	
	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza =null;
		
		if ("cheese".equals(type)) {
			pizza = new ChicagoCheesePizza();
		}
		if ("clam".equals(type)) {
			pizza = new ChicagoClamPizza();
		}
		if ("veggie".equals(type)) {
			pizza = new ChicagoVeggiePizza();
		}
		return pizza;
	}

}
