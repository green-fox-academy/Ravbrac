package pokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Which pokemon should Ash use?

        System.out.print("I choose you, " + effectivePokemon(pokemonOfAsh, wildPokemon));
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }

    public static String  effectivePokemon (List<Pokemon> pokemons, Pokemon enemyPokemon){
        String chosenPokemon = null;
        for (Pokemon pokemon : pokemons) {
            if (pokemon.isEffectiveAgainst(enemyPokemon)) {
                chosenPokemon = pokemon.name;
                break;
            }
        }
        return chosenPokemon;
    }
}