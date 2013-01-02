package cn.learn.pattern.status;

public class SoldOutState implements IState{
	
	private NewGumballMachine gumballMachine;
	
	public SoldOutState(NewGumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Sold out,you can not insert quarter!");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sold out,you do not insert,so you can not eject quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turn,but sold out.");
	}

	@Override
	public void dispense() {
		System.out.println("Error.");
	}

}
