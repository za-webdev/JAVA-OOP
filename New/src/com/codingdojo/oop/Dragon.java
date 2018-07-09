package com.codingdojo.oop;

public class Dragon extends Mammal {
	
	public Dragon() {
		super(300);
	}
	
	
	public void fly() {
		System.out.println("fushhhhh!!");
		this.setEnergyLevel(this.getEnergyLevel()-50);
	}
	
	public void eatHumans() {
		System.out.println("NOM NOM NOm");
		this.setEnergyLevel(this.getEnergyLevel()+25);
	}
	
	public void attackTown() {
		System.out.println("hahahahahah");
		this.setEnergyLevel(this.getEnergyLevel()-100);
	}
	 
}
