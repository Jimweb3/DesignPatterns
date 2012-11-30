package cn.learn.pattern.factory;

public class ChicagoCheesePizza extends Pizza{
	
	public ChicagoCheesePizza() {
	   name = "Chicago Style Cheese Pizza"; 
       dough = "Extra Thick Crust Dough"; //����ؿ����ŵ�
       sauce = "Plum Tomato Sauce"; //���ӷ��ѽ�
       //��������
       toppings.add("Shredded Mozzarella Cheese"); //������������
       toppings.add("Frozen Clams from Chesapeake Bay"); //������Ƥ������䶳�
	}
	
	//���¶�������е�����pizza
	@Override
	void cut() {
		System.out.println("Cutting the pizza into 'square' slices"); //�гɷ��εĿ�
	}
	
}
