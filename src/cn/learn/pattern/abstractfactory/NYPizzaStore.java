package cn.learn.pattern.abstractfactory;

public class NYPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null; 
        //原料提供厂
		IPizzaIngredientFactory ingredientFactory = 
            new NYPizzaIngredientFactory(); 
        
        if (type.equals("cheese")) { 
        	//创建一个cheese口味的pizza,把原料工厂传给这个pizza,在pizza里自己从原料厂里拿原料
        	pizza = new CheesePizza(ingredientFactory); 
            pizza.name = "New York Style Cheese Pizza";
            
        } else if (type.equals("veggie")) { 
           //这儿没补全了，可以自己补
        } else if (type.equals("clam")) { 
            
        } else if (type.equals("pepperoni")) {
           
        } 
        return pizza; 
	}

}
