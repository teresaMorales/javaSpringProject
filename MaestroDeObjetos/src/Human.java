
public class Human {
	//atributos 
	protected int strength;
	protected int intelligence;
	protected int stealth;
	protected int healt;
	
	
	//constructor
	public Human() {
		healt=100;
		strength=3;
		intelligence=3;
		stealth=3;
	}
	
	
	public int getStrength() {
		return strength;
	}


	public void setStrength(int strength) {
		this.strength = strength;
	}


	public int getIntelligence() {
		return intelligence;
	}


	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}


	public int getStealth() {
		return stealth;
	}


	public void setStealth(int stealth) {
		this.stealth = stealth;
	}


	public int getHealt() {
		return healt;
	}


	public void setHealt(int healt) {
		this.healt = healt;
	}


	//metodo
	public void attack (Human ataque) {
		ataque.healt -= this.strength;	
		
	}
	public String toString() {
		return this.healt + "\n";
	}
}


// fuerza
// inteligencia
// sigilio
// vida