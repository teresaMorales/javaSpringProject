package com.codingdojo.web.models;

public class Dog extends Animal implements Pet{

	public Dog(String name, String breed, double weight) {
		super (name,breed,weight);
	}
	@Override
	public String showAffection() {
		if(this.getWeight() < 30) {
			return "Tu perro de raza " + getBreed() + ", "+ getName()+" salt� a tu regazo y te abraz�";
		}		
		else
			return "Tu perro de raza " + getBreed()+ ", "+ getName()+" se acurruc� a tu lado";
	}

}

//para perros de <30 libras, p�dales que se suban a su regazo.
//para perro> = 30 libras, haz que se acurruquen a tu lado