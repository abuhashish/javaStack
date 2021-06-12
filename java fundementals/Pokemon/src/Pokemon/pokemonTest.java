package Pokemon;

public class pokemonTest {

	public static void main(String[] args) {
		pokedox x=new pokedox();
		Pokemon poke1=x.createPokemon("amro", 100, "electric");
		Pokemon poke2=x.createPokemon("yara", 100, "earth");
		x.listPokemon();
		poke1.attackPokemon(poke2);
		x.listPokemon();
	}

}
