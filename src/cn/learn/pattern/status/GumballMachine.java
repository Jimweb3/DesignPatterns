package cn.learn.pattern.status;

/**
 * 一个简单的售糖果的机器
 * @author qianjin
 *
 */
public class GumballMachine {
	
	private final static int SOLD_OUT = 0 ;
	private final static int NO_QUARTER = 1 ;
	private final static int HAS_QUARTER = 2 ;
	private final static int SOLD = 3 ;
	
	int status = SOLD_OUT;
	
	//商品的总数
	int count = 0;
	
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			//如果商品>0，现在的出货机正处于需要投币的状态中
			status = NO_QUARTER;
		}
	}
	
	//投入25分钱
	public void insertQuarter(){
		
		if (status == HAS_QUARTER) {
			System.out.println("你不需要再投入25分钱");
		} else if (status == NO_QUARTER) {
			status = HAS_QUARTER;
			System.out.println("你投入了25分钱");
		} else if (status == SOLD_OUT) {
			System.out.println("不能投入钱，没有商品了");
		} else if(status == SOLD){
			 System.out.println("请稍等，正在出货");
		}
	
	}
	
	//退钱
	public void ejectQuarter(){
		if (status == HAS_QUARTER) {
			status = NO_QUARTER;
			System.out.println("退出25分钱");
		} else if (status == NO_QUARTER) {
			System.out.println("你没有投入钱，退出0分钱");
		} else if (status == SOLD_OUT) {
			System.out.println("因为没货不能投入钱了，所以没钱可退");
		} else if(status == SOLD){
			System.out.println("你不能再退钱了，因为已经出货了");
		}
	}
	
	//按动出售商品的按键
	public void turnCrank(){
		
		System.out.println("你按下了出货按键...");
		
		if (status == HAS_QUARTER) {
			status = SOLD;
			//发放口香糖
			dispense();
			
		} else if (status == NO_QUARTER) {
			System.out.println("请先投入钱");
		} else if (status == SOLD_OUT) {
			System.out.println("虽然你按了出货键，但是没货了");
		} else if(status == SOLD){
			System.out.println("正在出货，按两次也没用");
		}
	}
	
	//出售
	private void dispense() {
		if (status == SOLD) {
			System.out.println("售出商品");
			count --;
			if (count == 0) {
				System.out.println("商品卖光了");
				status = SOLD_OUT;
			} else {
				status = NO_QUARTER;
			}
		} else if (status == NO_QUARTER) {
			System.out.println("你需要先付钱");
		} else if (status == HAS_QUARTER) {
			System.out.println("出现错误，没有商品被货出");
		} else if (status == SOLD_OUT) {
			System.out.println("出现错误，没有商品被货出");
		}
		
	}
	
	@Override
	public String toString() {
		if (status == SOLD_OUT) {
			return "当前状态是：无货";
		} else if (status == NO_QUARTER) {
			return "当前状态是：未投币";
		} else if (status == HAS_QUARTER) {
			return "当前状态是：已投币";
		} else {
			return "当前状态是：售货中";
		}
	}

}
