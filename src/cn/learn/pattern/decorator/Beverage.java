package cn.learn.pattern.decorator;

/**
 * ���ϵĳ���
 * @author qianjin
 */
public abstract class Beverage {
	String description = "Uknowed Beverage";
	
	public String getDescription() {
		return description;
	}
	//����۸�ķ���
	public abstract double cost();
}
