package cn.learn.pattern.component;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent>{
	
	//用一个栈来装这些Menu
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}
	
	//递归判断是否还有菜单
	@Override
	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {//如果没有next表示不是菜单，是个菜单项
				stack.pop();
				return hasNext();//递归调用
			} else {
				return true;
			}
		}
	}

	@Override
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent menuComponent = iterator.next();
			if (menuComponent instanceof Menu) {
				stack.push(menuComponent.createIterator());
			}
			return menuComponent;
		} else {
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
