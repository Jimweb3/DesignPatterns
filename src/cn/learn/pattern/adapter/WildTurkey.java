package cn.learn.pattern.adapter;

public class WildTurkey implements ITurkey{
	@Override
	public void gobble() {
		System.out.println("�𼦿�����");
	}
	@Override
	public void fly() {
		System.out.println("��Ҳ�ܷɣ�����һС��");
	}
}
