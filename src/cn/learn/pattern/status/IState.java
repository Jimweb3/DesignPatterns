package cn.learn.pattern.status;


public interface IState {
	//投钱
	public void insertQuarter();
	//退钱
	public void ejectQuarter();
	//按开关
	public void turnCrank();
	//出货（糖果机吐出糖果）
	public void dispense();
}
