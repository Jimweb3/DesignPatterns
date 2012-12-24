package cn.learn.pattern.component;

import java.util.Iterator;

public class MenuItem extends MenuComponent{
	
	private String name;
	private String desc;
	private double price;
	private boolean vegetrian;
	
	public MenuItem(String name, String desc,boolean vegetrian, double price) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.vegetrian = vegetrian;
	}
	
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	public double getPrice() {
		return price;
	}

	@Override
	public boolean isVegetrian() {
		return vegetrian;
	}
	
	//÷ÿ–¥print
	@Override
	public void print() {
		System.out.println("MenuItem:" + getName());
		if (isVegetrian()) {
			System.out.println("-V-");
		}
		System.out.println(getDesc());
		System.out.println(getPrice());
	}
	
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
	
	
	
}
