package cn.learn.pattern.abstractfactory;

public class MyTest {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		pizza.dough.display();//�����Ǻ�������
		pizza.sauce.display();//�����Ǻ��ֽ�
		System.out.println("====done====");
	}
}
