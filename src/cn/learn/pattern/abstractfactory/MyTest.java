package cn.learn.pattern.abstractfactory;

public class MyTest {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		pizza.dough.display();//看看是何种面团
		pizza.sauce.display();//看看是何种酱
		System.out.println("====done====");
	}
}
