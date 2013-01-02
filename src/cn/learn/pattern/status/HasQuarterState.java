package cn.learn.pattern.status;

import java.util.Random;

//�ǹ�������25��Ǯ��״̬
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
		int num = random.nextInt(10);//�õ�һ�������
		if (num == 0 && gumballMachine.getCount()>1) {//Ҫ���������0�����ǹ����ﻹ��2�����ϵ��ǹ�����ô���н��ˣ����һ����õ������ǹ�
			//�н�״̬
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			//����״̬
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("Error,do nothing.");
	}

}
