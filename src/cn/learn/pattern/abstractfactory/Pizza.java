package cn.learn.pattern.abstractfactory;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name; //pizza����
  
	Dough dough;
	Sauce sauce;
    
    ArrayList<String> toppings = new ArrayList<String>();//���ArrayListά����һ������
    
    abstract void prepare();//�ɾ����Ʒ��ʵ��
    
    void bake() { 
        System.out.println("Bake for 25 minutes at 350"); 
    } 
    void cut() { 
        System.out.println("Cutting the pizza into diagonal slices"); //�Խ��ߵ��гɼ���
    } 
    void box() { 
        System.out.println("Place pizza in official PizzaStore box"); 
    } 
    public String getName() { 
        return name; 
    }
    
    //��дtoString����鿴��������pizza
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
