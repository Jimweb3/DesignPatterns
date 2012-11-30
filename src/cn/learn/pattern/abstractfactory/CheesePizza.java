package cn.learn.pattern.abstractfactory;

public class CheesePizza extends Pizza{
	
	IPizzaIngredientFactory ingredientFactory; 
	
	public CheesePizza(IPizzaIngredientFactory factory) {
		this.ingredientFactory = factory;
	}
	
	//重写prepare方法，拿原料
	@Override
	void prepare() {
		System.out.println("Preparing " + name); 
        dough = ingredientFactory.createDough(); 
        sauce = ingredientFactory.createSauce(); 
	}

}
