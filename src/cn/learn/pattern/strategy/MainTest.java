package cn.learn.pattern.strategy;

public class MainTest {
	public static void main(String[] args) {
		
		//ʵ����һֻѼ
		Duck duck = new OneDuck();
		//��ֻѼ�ġ��ɡ��͡��С��ı����ǣ�
		duck.preformFly();
		duck.preformQuack();
		/*�����
		Fly with wings..
		The duck can not quack..
		��������Ƕ������ֻ"OneDuck"�ı�����һ�µģ��ܷɣ����ܽС�
		*/
		
		//�����ڶ�ֻѼ�ӣ�
		Duck anotherDuck = new TwoDuck();
		anotherDuck.preformFly();
		anotherDuck.preformQuack();
		
		//�������õڶ�ֻѼ�ӵķɵ���Ϊ�������ܷ�
		anotherDuck.setFlyBehavior(new FlyWithWings());
		System.out.println("----");
		anotherDuck.preformFly();
		
		/*�����������Ҳ�����ǵĶ������ֻ��TwoDuck���ı�����һ����
		 * The duck can not fly..
		   The duck squeak..
		 */
		
		
	}
}	
