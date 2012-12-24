package cn.learn.pattern.iterator;

public class MenuItem {
	
	private String name;
	private String desc;
	private double price;
	private boolean vegetrian;
	
	public MenuItem(String name, String desc, double price, boolean vegetrian) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.vegetrian = vegetrian;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isVegetrian() {
		return vegetrian;
	}
	public void setVegetrian(boolean vegetrian) {
		this.vegetrian = vegetrian;
	}
	
}
