package cn.learn.pattern.status;

public class NewGumballMachine {
	
	IState soldOutState;
	IState soldState;
	IState noSquarterState;
	IState hasSquarterState;
	IState winnerState;
	
	IState state = soldOutState;
	int count = 0;
	
	public NewGumballMachine(int count) {
		//ʵ��������״̬
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		noSquarterState = new NoQuarterState(this);
		hasSquarterState = new HasQuarterState(this);
		winnerState =  new WinnerState(this);
		this.count = count;
		if (count>0) {
			state = noSquarterState;
		}
	}
	//�����ǹ����Ķ�����ί�и������״̬��
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	public void setState(IState state){
		this.state = state;
	}
	
	//�ǹ����³��ǹ�������Ҫ��1
	public void releaseBall(){
		if (count != 0) {
			count --;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	//getter and setter
	public IState getSoldOutState() {
		return soldOutState;
	}
	public IState getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(IState winnerState) {
		this.winnerState = winnerState;
	}

	public void setSoldOutState(IState soldOutState) {
		this.soldOutState = soldOutState;
	}
	public IState getSoldState() {
		return soldState;
	}
	public void setSoldState(IState soldState) {
		this.soldState = soldState;
	}
	public IState getNoSquarterState() {
		return noSquarterState;
	}
	public void setNoSquarterState(IState noSquarterState) {
		this.noSquarterState = noSquarterState;
	}
	public IState getHasSquarterState() {
		return hasSquarterState;
	}
	public void setHasSquarterState(IState hasSquarterState) {
		this.hasSquarterState = hasSquarterState;
	}
	
	
}
