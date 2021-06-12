package Pokemon;
import java.util.ArrayList;
public class pokedox extends AbstractPokemon{
protected ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon x=new Pokemon(name,health,type);
		pokemons.add(x);
		return x;
	}

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		String string=("pokemon name is :"+pokemon.getName()+"pokemon health is : "+pokemon.getHealth()+"pokemon type is : "+pokemon.getType());
		return string;
	}

	@Override
	public void listPokemon() {
		for(Pokemon x:pokemons) {
			System.out.println(x.getName()+x.getHealth()+x.getType());
		}
		
	}

}
