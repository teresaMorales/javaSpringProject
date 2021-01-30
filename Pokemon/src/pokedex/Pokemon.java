package pokedex;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count;
	
	public Pokemon(String name, int health, String type) {
		this.name=name;
		this.health=health;
		this.type=type;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Pokemon.count = count;
	}

	void attackPokemon (Pokemon pokemon) {
		int vida = pokemon.getHealth()-10;
		pokemon.setHealth(vida);
	}

}
















