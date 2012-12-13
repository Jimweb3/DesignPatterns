package cn.learn.pattern.template_method;

//����������
public abstract class CaffeineBeverage {
	//�����ඨ��һ���㷨������㷨������׼�����ϵ�,������㷨�����final�������಻��ʵ����
	public final void prepareRecipe(){
		//1.��Щˮ
		boilWater();
		//2.����
		brew();
		//3.���뱭��
		pourInCup();
		//4.��Щ����
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	//�������������Ҫ��γ��ݺͼ���Щ����
	public abstract void brew();
	public abstract void addCondiments();
	
	//���ǹ�ͬ�е�
	private void boilWater() {
		System.out.println("boil water");
	}
	private void pourInCup() {
		System.out.println("pour in cup");
	}
	
	//Ĭ������Ƿ���true��Ҳ�����㷨���ǰ�ԭ�������һֱִ����ȥ
	public boolean customerWantsCondiments(){
		return true;
	}

}
