package cn.learn.pattern.status;


public interface IState {
	//ͶǮ
	public void insertQuarter();
	//��Ǯ
	public void ejectQuarter();
	//������
	public void turnCrank();
	//�������ǹ����³��ǹ���
	public void dispense();
}
