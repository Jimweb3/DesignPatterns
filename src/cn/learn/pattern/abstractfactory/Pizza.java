package cn.learn.pattern.abstractfactory;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name; //pizza名字
  
	Dough dough;
	Sauce sauce;
    
    ArrayList<String> toppings = new ArrayList<String>();//这个ArrayList维护了一套佐料
    
    abstract void prepare();//由具体产品类实现
    
    void bake() { 
        System.out.println("Bake for 25 minutes at 350"); 
    } 
    void cut() { 
        System.out.println("Cutting the pizza into diagonal slices"); //对角线的切成几块
    } 
    void box() { 
        System.out.println("Place pizza in official PizzaStore box"); 
    } 
    public String getName() { 
        return name; 
    }
    
    //重写toString方便查看做出来的pizza
    public String toString() { 
        StringBuffer display = new StringBuffer(); 
        display.append("---- " + name + " ----\n"); 
        display.append(dough + "\n"); 
        display.append(sauce + "\n"); 
        for (int i = 0; i < toppings.size(); i++) { 
            display.append((String )toppings.get(i) + "\n"); 
        } 
        return display.toString(); 
    } 
	
	
}
