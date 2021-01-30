package pokedex;

public class Pokedexx extends AbstractPokemon{

	private int myPokemon;
	public Pokedexx() {
	}
	@Override
	public void listPokemon() {
		
		setMyPokemon(Pokemon.getCount());
	}


	
	public int getMyPokemon() {
		return myPokemon;
	}
	public void setMyPokemon(int myPokemon) {
		this.myPokemon = myPokemon;
	}

}
