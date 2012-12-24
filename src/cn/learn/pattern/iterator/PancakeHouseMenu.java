package cn.learn.pattern.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {

	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		// 初始化这个菜单，并将菜单添加一些菜
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
	//返回迭代器
	public IIterator createIterator() {
		return new PancakeHoushIterator(menuItems);
	}

}
