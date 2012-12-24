package cn.learn.pattern.iterator;

public class Waitress {
	
	DinerMenu dinerMenu;
	PancakeHouseMenu pancakeHouseMenu;
	
	public Waitress(DinerMenu dinerMenu,PancakeHouseMenu pancakeHouseMenu){
		this.dinerMenu = dinerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
	}
	
	public void printMenu(){
		//拿到迭代器
		IIterator pancakeHoushIterator = pancakeHouseMenu.createIterator();
		IIterator dinerIterator = dinerMenu.createIterator();
		//遍历迭代器
		System.out.println("Breakfast:");
		while (pancakeHoushIterator.hasNext()) {
			MenuItem menuItem = (MenuItem)pancakeHoushIterator.next();
			System.out.println("name:"+menuItem.getName());
			System.out.println("desc:"+menuItem.getDesc());
			System.out.println("price:"+menuItem.getPrice());
			System.out.println("-------------------------");
		}
		System.out.println("Lunch:");
		while (dinerIterator.hasNext()) {
			MenuItem menuItem = (MenuItem)dinerIterator.next();
			System.out.println("name:"+menuItem.getName());
			System.out.println("desc:"+menuItem.getDesc());
			System.out.println("price:"+menuItem.getPrice());
			System.out.println("-------------------------");
		}
	}
}
