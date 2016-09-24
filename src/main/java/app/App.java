package app;

import java.util.Scanner;

import plant.Plant;
import vegetable.Carrot;
import vegetable.Celery;
import vegetable.Onion;
import vegetable.Potatoes;
import basket.Basket;
import fruit.Apple;
import fruit.Banana;
import fruit.Orange;
import fruit.Pear;

public class App {
	static Scanner sc=new Scanner(System.in);
	static Basket bask=new Basket();
public static void main (String [] args){
	 int operator;
     boolean counter = true;
     Scanner sc=new Scanner(System.in);
     do {
         System.out.println("Выберете пункт меню:");
         System.out.println("1 - Добавить  в корзину");
         System.out.println("2 - Взять  из корзины");
         System.out.println("3 - Включить комбайн комбайн");
         System.out.println("Другая цифра - Выйти");
         System.out.print("Введите цифру ");
         
             int choice = Integer.parseInt(sc.next());
             switch (choice) {
                 case 1:{
                     addToBasket();
                     break;}
                 case 2:{
                     takeFromBasket();
                     break;}
                 case 3:{
                     combine();
                     break;}
                 
                 default: {counter= false; break;}
             }
     }while (counter);
}

public static void addToBasket(){
	boolean counter=true;
	do { 
        System.out.println("Добавить в корзину");
        System.out.println("1-Фрукт");
        System.out.println("2-Овощ");
               System.out.println("Другая цифра - Выйти");
        System.out.print("Введите цифру ");
       
            int choice = Integer.parseInt(sc.next());
            if(choice==1){
            	System.out.println();
            	System.out.println("1 Банан");
                System.out.println("2 Яблоко");
                System.out.println("3 Апельсин");
                       System.out.println("4 Груша");
                System.out.print("Введите цифру ");
                int ch = Integer.parseInt(sc.next());
            	 
                System.out.print("Введите вес фрукта ");
                double w = Double.parseDouble(sc.next());
                System.out.print("Введите  цвет ");
                String co = (sc.next());
                System.out.print("Введите зрелость ");
                String z = (sc.next());
                System.out.print("Введите  кондицию ");
                String c = (sc.next());
                
            	
            	
            switch (ch) {
                case 1:{
                	Banana b=new Banana(w,co,z,c);
                	bask.put(b);
                    break;}
                case 2:{
                	Apple b=new Apple(w,co,z,c);
                	bask.put(b);
                    break;}
                case 3:{
                	Orange b=new Orange(w,co,z,c);
                	bask.put(b);
                    break;}
                case 4:{
                	Pear b=new Pear(w,co,z,c);
                	bask.put(b);
                    break;}
                
                default: {counter= false; break;}
            }
           
            }
            
            
            if(choice==2){
            	System.out.println();
            	System.out.println("1 Carrot");
                System.out.println("2 Celery");
                System.out.println("3 Onion");
                       System.out.println("4 Potatoe");
                       System.out.println("Введите цифру ");
                int ch = Integer.parseInt(sc.next());
            	 
                System.out.print("Введите вес овощи ");
                double w = Double.parseDouble(sc.next());
                System.out.print("Введите  цвет ");
                String co = (sc.next());
                System.out.print("Введите зрелость ");
                String z = (sc.next());
                System.out.print("Введите  кондицию ");
                String c = (sc.next());
                
            	
            	
            switch (ch) {
                case 1:{
                	Carrot b=new Carrot(w,co,z,c);
                	bask.put(b);
                    break;}
                case 2:{
                	Celery b=new Celery(w,co,z,c);
                	bask.put(b);
                    break;}
                case 3:{
                	Onion b=new Onion(w,co,z,c);
                	bask.put(b);
                    break;}
                case 4:{
                	Potatoes b=new Potatoes(w,co,z,c);
                	bask.put(b);
                    break;}
                
                default: {counter= false; break;}
            }
            
            }
            else {counter= false;}
    }while (counter); 
	bask.print();
	
}
public static void takeFromBasket(){
	boolean counter=true;
	do { 
        System.out.println("1- удалить элемент по индексу");
        System.out.println("2- удалить все из корзины");
        System.out.println("3-извлечь все фрукты");
        System.out.println("4-извлечь все овощи");
        System.out.println("5-общий вес корзины");
        System.out.println("Другая цифра - Выйти");
        System.out.print("Введите цифру ");
            int choice = Integer.parseInt(sc.next());
            switch (choice) {
            case 1:{
            	System.out.print("Введите позицию.(должна быть меньше" +(bask.getSize()-1));
            	 int pos= Integer.parseInt(sc.next());
            	 bask.extract(pos);
            	 bask.print();
                break;}
            case 2:{
            	Plant []temp=bask.extractAll();
            	bask.print();
                break;}
            case 3:{
            	bask.extractAllFruits();
            	bask.print();
                break;}
            case 4:{
            	bask.extractAllVegetables();
            	bask.print();
                break;}
            case 5:{
            	System.out.println("Общий вес корзины "+bask.getWeight()+" г.");
                break;}
            
            default: {counter= false; break;}
        }
        
        }while (counter);
	} 
	
	
	

public static void combine(){
	
}
}
