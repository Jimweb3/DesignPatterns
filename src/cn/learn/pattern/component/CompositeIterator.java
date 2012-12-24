package cn.learn.pattern.component;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent>{
	
	//��һ��ջ��װ��ЩMenu
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}
	
	//�ݹ��ж��Ƿ��в˵�
	@Override
	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {//���û��next��ʾ���ǲ˵����Ǹ��˵���
				stack.pop();
				return hasNext();//�ݹ����
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
