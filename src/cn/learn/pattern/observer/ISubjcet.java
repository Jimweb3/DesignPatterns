package cn.learn.pattern.observer;

public interface ISubjcet {
	//�����������������������ע��۲��ߣ�ɾ���۲��ߣ����ݱ��ʱ֪ͨ�۲���
	public void registerObserver(IObserver o);
	public void removeObserver(IObserver o);
	public void notifyObserver();
	
}
