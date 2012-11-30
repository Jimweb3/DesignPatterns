package cn.learn.pattern.abstractfactory;

public class NYPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null; 
        //ԭ���ṩ��
		IPizzaIngredientFactory ingredientFactory = 
            new NYPizzaIngredientFactory(); 
        
        if (type.equals("cheese")) { 
        	//����һ��cheese��ζ��pizza,��ԭ�Ϲ����������pizza,��pizza���Լ���ԭ�ϳ�����ԭ��
        	pizza = new CheesePizza(ingredientFactory); 
            pizza.name = "New York Style Cheese Pizza";
            
        } else if (type.equals("veggie")) { 
           //���û��ȫ�ˣ������Լ���
        } else if (type.equals("clam")) { 
            
        } else if (type.equals("pepperoni")) {
           
        } 
        return pizza; 
	}

}
