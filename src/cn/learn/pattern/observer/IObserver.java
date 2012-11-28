package cn.learn.pattern.observer;

//观察者接口
public interface IObserver {
	//当主题有数据变更时，观察者的更新操作
	public void update(float temperature,float himidity,float pressture);
}
