
public class Samurai extends Human{
	private static int samuraiCount;
	
	public Samurai() {
		healt=200;
		samuraiCount++;
	}
	public void deathBlow(Human human) {
		int totalHumano = human.healt - human.healt;
		human.setHealt(totalHumano);
		
		int totalVida = this.getHealt()-100;
		this.setHealt(totalVida);
	}
	public void meditate() {
		int restaurar  = this.getHealt() +( this.getHealt()/2);
		this.setHealt(restaurar);
	}
	public void howMany() {
		
	}
	public static int samuraiCount() {
		return samuraiCount;
		
	}
}
