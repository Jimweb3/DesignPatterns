package cn.learn.pattern.status;

import java.util.Random;

//糖果机里有25分钱的状态
public class HasQuarterState implements IState{
	
	private NewGumballMachine gumballMachine;
	
	Random random = new Random(System.currentTimeMillis());
	
	public HasQuarterState(NewGumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("There has quarter,you do not need insert another one!");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You eject...");
		gumballMachine.setState(gumballMachine.getNoSquarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turn...");
		int num = random.nextInt(10);//得到一个随机数
		if (num == 0 && gumballMachine.getCount()>1) {//要是随机数是0，且糖果机里还有2颗以上的糖果，那么你中奖了，而且还能拿到二个糖果
			//中奖状态
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			//正常状态
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("Error,do nothing.");
	}

}
