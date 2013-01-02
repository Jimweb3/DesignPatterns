package cn.learn.pattern.status;

public class NoQuarterState implements IState{
	
	private NewGumballMachine gumballMachine;
	
	public NoQuarterState(NewGumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter!");
		gumballMachine.setState(gumballMachine.getHasSquarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You have not insert a quarter!");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned,but there no quarter!");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first!");
	}

}
