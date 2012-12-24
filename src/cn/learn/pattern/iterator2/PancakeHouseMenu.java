package cn.learn.pattern.iterator2;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements IMenu{

	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		// ��ʼ������˵��������˵����һЩ��
		menuItems = new ArrayList<MenuItem>();
		addMenuItem("K&B's Pancake Breakfast",
				"Pancakes with scrambled eggs, and toast", 2.99, true);
		addMenuItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, sausage", 2.99, false);
		addMenuItem("Blueberry Pancakes",
				"Pancakes made with fresh blueberries", 3.49, true);
		addMenuItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				3.59, true);
	}

	public void addMenuItem(String name, String desc, double price,
			boolean vegetrian) {
		MenuItem menuItem = new MenuItem(name, desc, price, vegetrian);
		menuItems.add(menuItem);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
	
}
