package cn.learn.pattern.factory;

public class MainTest {
	public static void main(String[] args) {
		
		//我这儿只实现了一种店，就是芝加哥风味的店，至于NY(纽约)风味的店，可以自己写写，类我都列出来了
		
		PizzaStore chicagoStore = new ChicagoPizzaStore(); 
        Pizza pizza = chicagoStore.orderPizza("cheese");//依赖于接口
        System.out.println(pizza.toString());
        
        Pizza pizza2 = chicagoStore.orderPizza("clam");
        System.out.println(pizza2.toString());
       
	}
}
