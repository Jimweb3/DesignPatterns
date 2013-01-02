package cn.learn.pattern.status;

public class WinnerState implements IState{

	private NewGumballMachine gumballMachine;
	
	public WinnerState(NewGumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("error");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("error");
	}

	@Override
	public void turnCrank() {
		System.out.println("error");
	}

	@Override
	public void dispense() {
		System.out.println("You are winner..");
		gumballMachine.releaseBall();
		System.out.println("售出商品1");
		int count = gumballMachine.getCount();
		if (count>0) {
			gumballMachine.releaseBall();
			System.out.println("售出商品2");
			if (gumballMachine.getCount()>0) {
				gumballMachine.setState(gumballMachine.getNoSquarterState());
			} else {
				System.out.println("Sold out!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		} else {
			System.out.println("Sold out");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		
	}

}
