package cn.learn.pattern.template_method;

public class Tea extends CaffeineBeverage{

	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("adding lemon");
	}

}
