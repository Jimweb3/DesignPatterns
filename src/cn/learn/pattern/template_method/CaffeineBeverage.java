package cn.learn.pattern.template_method;

//咖啡因饮料
public abstract class CaffeineBeverage {
	//抽象类定义一个算法，这个算法是用来准备饮料的,把这个算法定义成final，让子类不能实现它
	public final void prepareRecipe(){
		//1.烧些水
		boilWater();
		//2.冲泡
		brew();
		//3.倒入杯中
		pourInCup();
		//4.加些调料
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	//让子类决定到底要如何冲泡和加哪些调料
	public abstract void brew();
	public abstract void addCondiments();
	
	//这是共同有的
	private void boilWater() {
		System.out.println("boil water");
	}
	private void pourInCup() {
		System.out.println("pour in cup");
	}
	
	//默认情况是返回true，也就是算法还是按原来定义的一直执行下去
	public boolean customerWantsCondiments(){
		return true;
	}

}
