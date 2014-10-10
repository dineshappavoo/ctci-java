package com.ctci.objectorienteddesign;


enum Car {
	lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
	private int price;
	Car(int p) {
		price = p;
	}
	int getPrice() {
		return price;
	} 
}

enum Bike{
	bmw(50),ninja(25);
	private int price;
	Bike(int price)
	{
		this.price=price;
	}
	int getPrice()
	{
		return price;
	}
}
public class EnumExample {
	public static void main(String args[]){
		System.out.println("All car prices:");

		for (Car c : Car.values())
		{
			System.out.println(c + " costs " 
					+ c.getPrice() + " thousand dollars.");
		}
		
		for(Car c : Car.values())
		{
			System.out.println(c+" "+c.getPrice());
		}
		
		
		
		for(Bike b : Bike.values())
		{
			System.out.println(b+"  "+b.getPrice());
		}
	}
}