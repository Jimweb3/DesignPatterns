package cn.learn.pattern.adapter;

/**
 *火鸡接口 
 *火鸡不能“呱呱叫”但能“咯咯叫”；火鸡能飞，但飞不远
 */
public interface ITurkey {
	public void gobble();
	public void fly();
}
