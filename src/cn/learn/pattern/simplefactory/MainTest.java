package cn.learn.pattern.simplefactory;

public class MainTest {
	public static void main(String[] args) {
		
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		
		Pizza pizza = store.orderPizza("cheese");
		
		pizza.display();
		
	}
}
