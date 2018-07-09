package com.codingdojo.oop;

public class Mammal {
	private Integer energyLevel;
	
	public Mammal(Integer energyLevel){
		this.energyLevel=energyLevel;
	}
	 public Mammal() {
		 this.energyLevel=100;
	 }
	
	
	public Integer getEnergyLevel() {
		return energyLevel;
	}
	
	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel=energyLevel;
	}
	public Integer displayEnery() {
		System.out.println("Energy is " + this.energyLevel);
		return energyLevel;
	}
}
