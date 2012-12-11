package cn.learn.pattern.adapter;

public class MainTest {
	public static void main(String[] args) {
		//����һֻѼ�Ӻ�һֻ��
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		//��turkeyAdapter��һֻ��αװ��һֻѼ��
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says:");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe duck says:");
		testDuck(duck);
		
		System.out.println("\nThe turkeyAdapter says:");
		testDuck(turkeyAdapter);//�������Ҳ���õ�testDuck���������Ǵ���һ����������ȥ
		
	}
	
	public static void testDuck(IDuck duck){
		duck.quack();
		duck.fly();
	}
	
}
