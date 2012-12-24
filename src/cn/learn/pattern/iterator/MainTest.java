package cn.learn.pattern.iterator;

public class MainTest {
	public static void main(String[] args) {
		
		DinerMenu dinerMenu = new DinerMenu();
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		
		Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
		waitress.printMenu();
		
	}
}
