package cn.learn.pattern.adapter;

/**
 *火鸡适配器 
 */
public class TurkeyAdapter implements IDuck{
	
	ITurkey turkey;
	
	public TurkeyAdapter(ITurkey turkey) {
		this.turkey = turkey;
	}
	@Override
	public void quack() {
		turkey.gobble();
	}
	@Override
	public void fly() {
		//因为火鸡飞得距离太短，让它飞五次来表现出鸭子的特征
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
