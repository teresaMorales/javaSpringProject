
public class Ninja extends Human{
	
	public Ninja() {
		stealth=10;
	}
	public void steal(Human human) {	
		// robo
		int total = human.healt - this.stealth;
		human.setHealt(total);
		int totalNinja = this.healt +=this.stealth;
		this.setHealt(totalNinja);
		
	}
	public void runAway() {	
		int huir = this.getHealt()-10;
		this.setHealt(huir);
	}
}
//

//steal robar