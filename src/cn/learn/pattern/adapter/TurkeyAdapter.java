package cn.learn.pattern.adapter;

/**
 *�������� 
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
		//��Ϊ�𼦷ɵþ���̫�̣���������������ֳ�Ѽ�ӵ�����
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
