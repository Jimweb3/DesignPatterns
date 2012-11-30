package cn.learn.pattern.abstractfactory;

public class CheesePizza extends Pizza{
	
	IPizzaIngredientFactory ingredientFactory; 
	
	public CheesePizza(IPizzaIngredientFactory factory) {
		this.ingredientFactory = factory;
	}
	
	//��дprepare��������ԭ��
	@Override
	void prepare() {
		System.out.println("Preparing " + name); 
        dough = ingredientFactory.createDough(); 
        sauce = ingredientFactory.createSauce(); 
	}

}
