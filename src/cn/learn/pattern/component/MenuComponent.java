package cn.learn.pattern.component;

import java.util.Iterator;

public abstract class MenuComponent {
	
	//"组合"方法
	public void add(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public void getChild(int position) {
		throw new UnsupportedOperationException();
	}
	
	//"操作"方法
	public String getName () {
		throw new UnsupportedOperationException();
	}
	
	public String getDesc () {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetrian() {
		throw new UnsupportedOperationException();
	}
	
	//菜单和菜单项公有的方法
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	public Iterator<MenuComponent> createIterator(){
		throw new UnsupportedOperationException();
	}
	
	

}
