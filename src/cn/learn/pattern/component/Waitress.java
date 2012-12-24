package cn.learn.pattern.component;

import java.util.Iterator;


public class Waitress {
	
	MenuComponent allMenus;
	
	public Waitress(MenuComponent menuComponent) {
		this.allMenus = menuComponent;
	}
	
	public void printMenu(){
		allMenus.print();
	}
	
	public void printVegetarianMenu(){
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("---ËØ²Ë²Ëµ¥---");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
				if (menuComponent.isVegetrian()) {
					menuComponent.print();
				}
			} catch (Exception e) {
				//e.printStackTrace();
			}
		}
			
		
		
		
	}
	
	
	
}
