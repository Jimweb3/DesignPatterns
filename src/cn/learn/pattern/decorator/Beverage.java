package cn.learn.pattern.decorator;

/**
 * 饮料的超类
 * @author qianjin
 */
public abstract class Beverage {
	String description = "Uknowed Beverage";
	
	public String getDescription() {
		return description;
	}
	//计算价格的方法
	public abstract double cost();
}
