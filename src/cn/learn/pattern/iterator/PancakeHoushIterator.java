package cn.learn.pattern.iterator;

import java.util.ArrayList;

public class PancakeHoushIterator implements IIterator{
	
	ArrayList<MenuItem> list;
	int position = 0;
	
	public PancakeHoushIterator(ArrayList<MenuItem> list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		if (position >= list.size() || list.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem item = list.get(position);
		position ++;
		return item;
	}
	
	
	
}
