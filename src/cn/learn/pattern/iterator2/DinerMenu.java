package cn.learn.pattern.iterator2;

import java.util.Iterator;

public class DinerMenu implements IMenu{

	private final int MAX_ITEMS = 6;
	int position = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addMenuItem("Vegetarian BLT",
				"(Fakin') Bacon with lettuce & tomato on whole wheat", true,
				2.99);
		addMenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false,
				2.99);
		addMenuItem("Soup of the day",
				"Soup of the day, with a side of potato salad", false, 3.29);
		addMenuItem(
				"Hotdog",
				"A hot dog, with saurkraut, relish, onions, topped with cheese",
				false, 3.05);
		addMenuItem("Steamed Veggies and Brown Rice",
				"Steamed vegetables over brown rice", true, 3.99);
		addMenuItem(
				"Pasta",
				"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
				true, 3.89);
	}

	public void addMenuItem(String name, String desc, boolean vegetrian,
			double price) {
		MenuItem menuItem = new MenuItem(name, desc, price, vegetrian);
		if (position >= 6) {
			System.out.println("Menu is full!  Can't add item to menu");
		} else {
			menuItems[position] = menuItem;
			position++;
		}
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}

}
