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
	//ģ������һ���û��Ƿ���Ҫ�ӵ���
	public void setCustomerWants(Boolean isWants){
		flag = isWants;
	}
	
}
