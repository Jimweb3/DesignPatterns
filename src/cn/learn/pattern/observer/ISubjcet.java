package cn.learn.pattern.observer;

public interface ISubjcet {
	//定义主题的三个基础方法：注册观察者，删除观察者，数据变更时通知观察者
	public void registerObserver(IObserver o);
	public void removeObserver(IObserver o);
	public void notifyObserver();
	
}
