package com.codingdojo.web.models;

public class Dog extends Animal implements Pet{

	public Dog(String name, String breed, double weight) {
		super (name,breed,weight);
	}
	@Override
	public String showAffection() {
		if(this.getWeight() < 30) {
			return "Tu perro de raza " + getBreed() + ", "+ getName()+" saltó a tu regazo y te abrazó";
		}		
		else
			return "Tu perro de raza " + getBreed()+ ", "+ getName()+" se acurrucó a tu lado";
	}

}

//para perros de <30 libras, pídales que se suban a su regazo.
//para perro> = 30 libras, haz que se acurruquen a tu lado