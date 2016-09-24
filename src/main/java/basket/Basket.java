package basket;

import fruit.Apple;
import fruit.Banana;
import fruit.Fruit;
import fruit.Orange;
import fruit.Pear;
import plant.Plant;
import vegetable.Carrot;
import vegetable.Celery;
import vegetable.Onion;
import vegetable.Potatoes;
import vegetable.Vegetable;



public class Basket {
	private Plant []mas;
	private int size;
	
	public Basket() {
		mas = new Plant[2];size=0;
	}
	
	
public int getSize() {
	return size;
}
	//конструктор с определенным размером
	public Basket(int initialCapacity) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
       mas = new Plant[initialCapacity];size=0;
    }
	
	
	 public Basket(Basket obj) {
	        System.arraycopy(obj.mas, 0, mas, 0, obj.size);
	        size=obj.size;
	    }
	 //добавление любого фрукта или овоща
	 public <T extends Plant>void put(T obj){
		 if(size-mas.length>=0){
			 mas=trimToSize(1);
			 mas[size]=obj;++size;}
		 else{mas[size]=obj;++size;}
	 }
	 
	//добавление Корзины
		 public void put(Basket obj){
			 if((size+obj.size)-mas.length>=0){
				 mas=trimToSize((size+obj.size)-mas.length);
				 System.arraycopy(obj.mas,0, mas, size, obj.size);
				 size++;
			 }
			 else{
				 System.arraycopy(obj.mas,0, mas, size, obj.size);
				 size++;
			 }
		 }
		/////////////////////////////////////добавление массива фруктов или овощей
		 public <T extends Plant>void put(T[]obj){
			 if((size+obj.length)-mas.length>=0){
				 mas=trimToSize((size+obj.length)-mas.length);
				 System.arraycopy(obj,0, mas, size, obj.length);
				 size++;
			 }
			 else{
				 System.arraycopy(obj,0, mas, size, obj.length);
				 size++;
			 }
		 }
	 
	public Plant [] trimToSize(int number){//расширить
		Plant []array=new Plant[mas.length+number];
		System.arraycopy(mas, 0, array, 0, size);
		return array;
	}
	
	
	public double getWeight(){
		double fullWeight=0;
		for(int i=0; i<size;i++){
			fullWeight+=mas[i].getWeight();
		}
		return fullWeight;
	}
	
	public Plant [] extractAll(){
		Plant [] array=new Plant[size];
		System.arraycopy(mas, 0, array, 0, size);
		for(int i=0;i<size;i++){
			mas[i]=null;
			
		}size=0;
		return array;
	}
	
	
	public Plant extract(int pos){
		
		Plant []array=new Plant[mas.length];
		Plant temp=mas[pos];
		System.arraycopy(mas, 0, array, 0, pos);
		System.arraycopy(mas, pos+1, array, pos, size-pos-1);//size=pos+nmber
		return temp;
	}
	
	
	// удаление опр размера
	
	public Plant [] deleteSize(int pos,int number){
		Plant []array=new Plant[mas.length];
		System.arraycopy(mas, 0, array, 0, pos);
		System.arraycopy(mas, pos+number, array, pos, size-pos-number);//size=pos+nmber
		return array;
	}
	
	public void extractAllFruits(){
		for(int i=size-1;i>=0;i--){
			if(mas[i] instanceof Fruit|| mas[i] instanceof Apple||mas[i] instanceof Banana||
					mas[i] instanceof Orange||mas[i] instanceof Pear){
				mas=deleteSize(i,1); size=(i+1);
			}
		}
		 //Basket obj=new Basket(this);
		//return obj;
	
	}
	
	public void  extractAllVegetables(){
		for(int i=size-1;i>=0;i--){
			if(mas[i] instanceof Vegetable || mas[i] instanceof Carrot||mas[i] instanceof Celery||
					mas[i] instanceof Onion||mas[i] instanceof Potatoes){
				mas=deleteSize(i,1); size=(i+1);
			}
		}
		// Basket obj=new Basket(this);
		//return obj;
	
	}
 public void print(){
	 System.out.println("Корзина размером "+  mas.length+". Указатель size "+ size+".");
	 for(int i=0;i<size;i++){
		try{ System.out.println(mas[i].toString());}
		catch (Exception e){
			System.out.println("корзина пуста");
			size=0;
			break;
		}
	 }
 }
}
