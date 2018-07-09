package com.codingdojo.oop;

public class Gorilla extends Mammal {
	
	public Gorilla () {
		super();
	}
	
	public void throwSomething() {
		System.out.println("dumm dashhh darammmmm");
		this.setEnergyLevel(this.getEnergyLevel()-5);
	}
	
	public void eatBananas(){
		System.out.println("MMMM bananaaaa!!");
		this.setEnergyLevel(this.getEnergyLevel()+10);
		
	}
	
	public void climb(){
		System.out.println("Climibibgg!!");
		this.setEnergyLevel(this.getEnergyLevel()-10);
		
	}
	
}
