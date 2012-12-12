package cn.learn.pattern.template_method;

public class MainTest {
	public static void main(String[] args) {
		Tea tea = new Tea();
		tea.prepareRecipe();
		System.out.println("-----");
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
		
	}
}
