package cn.learn.pattern.strategy;

/**
 * “飞”的行为接口，接口规定必实现这个接口的飞的行为必须实现fly方法
 * @author qianjin
 */
public interface FlyBehavior {
	//定义一个飞的方法
	public void fly();
}
