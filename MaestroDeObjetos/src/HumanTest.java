
public class HumanTest {

	public static void main(String[] args) {
		Human a =new Human();
		Human b =new Human();
		Ninja ab = new Ninja();
		Samurai abc = new Samurai();
		Samurai abcd = new Samurai();
		Samurai abcde = new Samurai();

		b.attack(a);
		a.attack(b);
		a.attack(b);
		
		System.out.println("Nivel de vida humano B :" + b);
		System.out.println("Nivel de vida humano A :" + a);

		ab.steal(a);
		ab.steal(a);
		ab.steal(a);
			
		System.out.println("nivel vida Humano b: " + a);
		System.out.println("nivel vida ninja ab : " + ab);
		System.out.println(Samurai.samuraiCount());
	}
}
