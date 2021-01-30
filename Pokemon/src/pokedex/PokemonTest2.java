package pokedex;

public class PokemonTest2 {

	public static void main(String[] args) {
		
		Pokedexx pokedexx = new Pokedexx();	
		Pokemon uno = pokedexx.createPokemon("pikachu", 33, "electrico");
		Pokemon dos = pokedexx.createPokemon("pokechu",100,"electrico");
		Pokemon tres = pokedexx.createPokemon("charmander",100,"fuego");
		
		dos.attackPokemon(tres);
		dos.attackPokemon(tres);
		tres.attackPokemon(dos);
		System.out.println("Vida "+tres.getName() + " " +tres.getHealth());
		System.out.println("Vida pokechu :"+dos.getHealth());
		System.out.println(pokedexx.getMyPokemon());
	}

}
