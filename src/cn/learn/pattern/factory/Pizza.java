package cn.learn.pattern.factory;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name; //pizza����
    String dough; //������
    String sauce; //��
    
    ArrayList<String> toppings = new ArrayList<String>();//���ArrayListά����һ������
    
    void prepare() { 
        System.out.println("Preparing " + name); 
        System.out.println("Tossing dough..."); //����
        System.out.println("Adding sauce..."); //�ӽ�
        System.out.println("Adding toppings: "); //������
        for (int i = 0; i < toppings.size(); i++) { 
            System.out.println("   " + toppings.get(i)); 
        } 
    } 
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
