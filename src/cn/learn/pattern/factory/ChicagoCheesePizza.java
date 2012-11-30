package cn.learn.pattern.factory;

public class ChicagoCheesePizza extends Pizza{
	
	public ChicagoCheesePizza() {
	   name = "Chicago Style Cheese Pizza"; 
       dough = "Extra Thick Crust Dough"; //超厚地壳面团的
       sauce = "Plum Tomato Sauce"; //李子番茄酱
       //两种佐料
       toppings.add("Shredded Mozzarella Cheese"); //马苏里拉奶酪
       toppings.add("Frozen Clams from Chesapeake Bay"); //从切萨皮克湾的冷冻蚬
	}
	
	//重新定义如何切掉这种pizza
	@Override
	void cut() {
		System.out.println("Cutting the pizza into 'square' slices"); //切成方形的块
	}
	
}
