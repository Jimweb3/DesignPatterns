package cn.learn.pattern.status;

public class MainTest {
	public static void main(String[] args) {
		
//		GumballMachine gumballMachine = new GumballMachine(5);
//		
//		//情况1
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		System.out.println(gumballMachine.toString()+"------------");
//		
//		//情况2
//		gumballMachine.insertQuarter();
//		gumballMachine.ejectQuarter();
//		gumballMachine.turnCrank();
//		System.out.println(gumballMachine.toString()+"------------");
//		
//		//情况3
//		gumballMachine.insertQuarter();
//		gumballMachine.ejectQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.ejectQuarter();
//		System.out.println(gumballMachine.toString()+"--------------");
//		
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		
//		System.out.println(gumballMachine.toString());
		
		
		NewGumballMachine gumballMachine = new NewGumballMachine(10);
		for (int i = 0; i < 10; i++) {
			System.out.println("------第"+(i+1)+"次操作：-----");
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
		}

	}
}
