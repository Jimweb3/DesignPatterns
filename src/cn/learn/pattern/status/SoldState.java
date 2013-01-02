package cn.learn.pattern.status;

public class SoldState implements IState{
	
	private NewGumballMachine gumballMachine;
	
	public SoldState(NewGumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		System.out.println("You do not need insert quarter!");
	}
	@Override
	public void ejectQuarter() {
		System.out.println("Sold,you can not eject!");
	}
	@Override
	public void turnCrank() {
		System.out.println("You turn crank twice but not give you another!");
	}
	@Override
	public void dispense() {
		System.out.println("售出商品");
		gumballMachine.releaseBall();
		int count = gumballMachine.getCount();
		if (count>0) {
			gumballMachine.setState(gumballMachine.getNoSquarterState());
		} else {
			System.out.println("Sold out");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}
