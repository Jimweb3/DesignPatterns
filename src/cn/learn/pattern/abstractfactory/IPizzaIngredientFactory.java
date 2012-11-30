package cn.learn.pattern.abstractfactory;

//创建原料的抽象工厂，做成了接口，也可以是抽象类
public interface IPizzaIngredientFactory {
	//创建pizza面团
	public Dough createDough(); 
	//创建pizza酱
    public Sauce createSauce(); 
}
