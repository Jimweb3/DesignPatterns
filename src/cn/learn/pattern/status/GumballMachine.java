package cn.learn.pattern.status;

/**
 * һ���򵥵����ǹ��Ļ���
 * @author qianjin
 *
 */
public class GumballMachine {
	
	private final static int SOLD_OUT = 0 ;
	private final static int NO_QUARTER = 1 ;
	private final static int HAS_QUARTER = 2 ;
	private final static int SOLD = 3 ;
	
	int status = SOLD_OUT;
	
	//��Ʒ������
	int count = 0;
	
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			//�����Ʒ>0�����ڵĳ�������������ҪͶ�ҵ�״̬��
			status = NO_QUARTER;
		}
	}
	
	//Ͷ��25��Ǯ
	public void insertQuarter(){
		
		if (status == HAS_QUARTER) {
			System.out.println("�㲻��Ҫ��Ͷ��25��Ǯ");
		} else if (status == NO_QUARTER) {
			status = HAS_QUARTER;
			System.out.println("��Ͷ����25��Ǯ");
		} else if (status == SOLD_OUT) {
			System.out.println("����Ͷ��Ǯ��û����Ʒ��");
		} else if(status == SOLD){
			 System.out.println("���Եȣ����ڳ���");
		}
	
	}
	
	//��Ǯ
	public void ejectQuarter(){
		if (status == HAS_QUARTER) {
			status = NO_QUARTER;
			System.out.println("�˳�25��Ǯ");
		} else if (status == NO_QUARTER) {
			System.out.println("��û��Ͷ��Ǯ���˳�0��Ǯ");
		} else if (status == SOLD_OUT) {
			System.out.println("��Ϊû������Ͷ��Ǯ�ˣ�����ûǮ����");
		} else if(status == SOLD){
			System.out.println("�㲻������Ǯ�ˣ���Ϊ�Ѿ�������");
		}
	}
	
	//����������Ʒ�İ���
	public void turnCrank(){
		
		System.out.println("�㰴���˳�������...");
		
		if (status == HAS_QUARTER) {
			status = SOLD;
			//���ſ�����
			dispense();
			
		} else if (status == NO_QUARTER) {
			System.out.println("����Ͷ��Ǯ");
		} else if (status == SOLD_OUT) {
			System.out.println("��Ȼ�㰴�˳�����������û����");
		} else if(status == SOLD){
			System.out.println("���ڳ�����������Ҳû��");
		}
	}
	
	//����
	private void dispense() {
		if (status == SOLD) {
			System.out.println("�۳���Ʒ");
			count --;
			if (count == 0) {
				System.out.println("��Ʒ������");
				status = SOLD_OUT;
			} else {
				status = NO_QUARTER;
			}
		} else if (status == NO_QUARTER) {
			System.out.println("����Ҫ�ȸ�Ǯ");
		} else if (status == HAS_QUARTER) {
			System.out.println("���ִ���û����Ʒ������");
		} else if (status == SOLD_OUT) {
			System.out.println("���ִ���û����Ʒ������");
		}
		
	}
	
	@Override
	public String toString() {
		if (status == SOLD_OUT) {
			return "��ǰ״̬�ǣ��޻�";
		} else if (status == NO_QUARTER) {
			return "��ǰ״̬�ǣ�δͶ��";
		} else if (status == HAS_QUARTER) {
			return "��ǰ״̬�ǣ���Ͷ��";
		} else {
			return "��ǰ״̬�ǣ��ۻ���";
		}
	}

}
