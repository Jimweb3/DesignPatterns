package cn.learn.pattern.factory;

public class ChicagoClamPizza extends Pizza{

	public ChicagoClamPizza() {
		   name = "Chicago Style Clam Pizza"; 
	       dough = "Extra Thick Crust Dough"; //超厚地壳面团的
	       sauce = "Tomato Sauce"; //番茄酱
	       //两种佐料
	       toppings.add("Cheese"); //奶酪
	       toppings.add("Frozen Clams"); //冷冻蚬
		}
	

}
