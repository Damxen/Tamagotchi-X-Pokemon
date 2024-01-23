


//--------------------------TEST----------------------------------------------------//

package PokemonAscii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class printPokemon {
    
    public static void printGermignon() throws IOException{
        File file = new File("PokemonAscii/Germignon.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.print(line);
        }
    }

    public static void printSalameche() throws IOException{
        File file = new File("PokemonAscii/Salameche.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.print(line);
        }
    }

    public static void printPikachu() throws IOException{
        File file = new File("PokemonAscii/Pikachu.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.print(line);
        }
    }

}
