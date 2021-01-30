
public class Wizard extends Human{

	public Wizard() {
		healt=50;
		intelligence=8;
	}
	
	public void heal(Human human) {
		human.healt += this.intelligence;
	}
	public void fireBall(Human human) {
		human.healt -= this.intelligence*3;
	}
}
