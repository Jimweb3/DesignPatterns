package cn.learn.pattern.factory;

public class MainTest {
	public static void main(String[] args) {
		
		//�����ֻʵ����һ�ֵ꣬����֥�Ӹ��ζ�ĵ꣬����NY(ŦԼ)��ζ�ĵ꣬�����Լ�дд�����Ҷ��г�����
		
		PizzaStore chicagoStore = new ChicagoPizzaStore(); 
        Pizza pizza = chicagoStore.orderPizza("cheese");//�����ڽӿ�
        System.out.println(pizza.toString());
        
        Pizza pizza2 = chicagoStore.orderPizza("clam");
        System.out.println(pizza2.toString());
       
	}
}
