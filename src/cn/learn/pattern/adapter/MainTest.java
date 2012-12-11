package cn.learn.pattern.adapter;

public class MainTest {
	public static void main(String[] args) {
		//创建一只鸭子和一只火鸡
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		//用turkeyAdapter把一只火鸡伪装成一只鸭子
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says:");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe duck says:");
		testDuck(duck);
		
		System.out.println("\nThe turkeyAdapter says:");
		testDuck(turkeyAdapter);//这儿我们也调用的testDuck方法，但是传的一个适配器过去
		
	}
	
	public static void testDuck(IDuck duck){
		duck.quack();
		duck.fly();
	}
	
}
