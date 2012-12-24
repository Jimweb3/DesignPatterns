package cn.learn.pattern.iterator;

public class DinerMenuIterator implements IIterator{
	
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
	public Object next() {
		MenuItem item = menuItems[position];
		position ++;
		return item;
	}

}
