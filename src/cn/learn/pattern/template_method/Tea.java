package cn.learn.pattern.template_method;

public class Tea extends CaffeineBeverage{
	
	Boolean flag = true;
	
	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}
	@Override
	public void addCondiments() {
		System.out.println("adding lemon");
	}
	@Override
	public boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		return flag;
	}
	//模拟设置一下用户是否想要加调料
	public void setCustomerWants(Boolean isWants){
		flag = isWants;
	}
	
}
