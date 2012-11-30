package cn.learn.pattern.factory;

public class NYStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza =null;
		
		if ("cheese".equals(type)) {
			pizza = new NYCheesePizza();
		}
		if ("clam".equals(type)) {
			pizza = new NYClamPizza();
		}
		if ("veggie".equals(type)) {
			pizza = new NYVeggiePizza();
		}
		
		return pizza;
	}

}
