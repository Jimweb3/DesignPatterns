package cn.learn.pattern.abstractfactory;

//����ԭ�ϵĳ��󹤳��������˽ӿڣ�Ҳ�����ǳ�����
public interface IPizzaIngredientFactory {
	//����pizza����
	public Dough createDough(); 
	//����pizza��
    public Sauce createSauce(); 
}
