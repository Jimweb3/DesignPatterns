package cn.learn.pattern.simplefactory;

public class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	//pizza���ж�pizza�ķ���
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = factory.createPizza(type);//�ù������д���pizza�����������������ж�Ȼ����new������
		//��pizza���к����ļӹ���׼��ԭ�ϣ��濾���п飬���
		pizza.prepeare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
