package com.codingdojo.web.models;

public class Cat extends Animal implements Pet{
		
	public Cat(String name, String breed, double weight) {
			super (name,breed,weight);
		}
	@Override
	public String showAffection() {
		
		return "Tu gato de raza "+getBreed()+ ", " +getName()+" te mir� con afecto";
	}

}
