package cn.learn.pattern.iterator2;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem>{
	
	MenuItem[] menuItems;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= menuItems.length || menuItems[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem item = menuItems[position];
		position ++;
		return item;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
