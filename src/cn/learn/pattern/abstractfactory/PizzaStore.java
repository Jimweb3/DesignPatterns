package cn.learn.pattern.abstractfactory;

public abstract class PizzaStore {
	
	//������pizza������
	public Pizza orderPizza(String type) {
		
		//createPizza�ӹ������ƻض�����
		Pizza pizza = createPizza(type);
	
		pizza.prepare();
		
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}
	
	//������ȥʵ�֣�ÿ���궼�����Լ���pizza����orderpizza��֤����pizza���������ܵ��ܲ������Ƶ�
	abstract Pizza createPizza(String type);
	
}
