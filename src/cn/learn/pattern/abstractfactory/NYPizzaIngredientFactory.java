package cn.learn.pattern.abstractfactory;

//һ������Ĺ���,�����������������Ӧ��ԭ��
public class NYPizzaIngredientFactory implements IPizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

}
