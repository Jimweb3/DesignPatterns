package cn.learn.pattern.decorator;

/**
 *装饰者的抽像类，也继承于Beverage
 */
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
