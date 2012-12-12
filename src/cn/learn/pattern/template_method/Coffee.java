package cn.learn.pattern.template_method;

public class Coffee extends CaffeineBeverage{
	@Override
	public void brew() {
		System.out.println("Dripping coffee through filter");
	}
	@Override
	public void addCondiments() {
		System.out.println("adding sugar and milk");
	}
}
