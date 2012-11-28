package cn.learn.pattern.strategy;

public class MainTest {
	public static void main(String[] args) {
		
		//实例化一只鸭
		Duck duck = new OneDuck();
		//这只鸭的“飞”和“叫”的表现是：
		duck.preformFly();
		duck.preformQuack();
		/*结果：
		Fly with wings..
		The duck can not quack..
		结果跟我们定义的那只"OneDuck"的表现是一致的：能飞，不能叫。
		*/
		
		//看看第二只鸭子：
		Duck anotherDuck = new TwoDuck();
		anotherDuck.preformFly();
		anotherDuck.preformQuack();
		
		//重新设置第二只鸭子的飞的行为，让它能飞
		anotherDuck.setFlyBehavior(new FlyWithWings());
		System.out.println("----");
		anotherDuck.preformFly();
		
		/*结果：这个结果也跟我们的定义的那只“TwoDuck”的表现是一样的
		 * The duck can not fly..
		   The duck squeak..
		 */
		
		
	}
}	
