package cn.learn.pattern.component;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	
	//menu组件
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	
	String name;
	String desc;
	
	public Menu(String name,String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getDesc() {
		return desc;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	@Override
	public void getChild(int position) {
		menuComponents.get(position);
	}
	
	@Override
	public void print() {
		System.out.println("--menu name--"+getName());
		System.out.println(getDesc());
		System.out.println("------------------------");
		//遍历出menu中的item
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
	
	@Override
	public Iterator<MenuComponent> createIterator() {
		// TODO Auto-generated method stub
		return new CompositeIterator(menuComponents.iterator());
	}
	
}
