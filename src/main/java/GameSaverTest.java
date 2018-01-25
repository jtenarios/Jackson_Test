import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class GameSaverTest {

    public static void main(String[] args) throws FileNotFoundException {
        GameCharacter one = new GameCharacter(50, "Elf", "bow");
        GameCharacter two = new GameCharacter (200, "Troll", "big ax") ;
        GameCharacter three =new GameCharacter(120, "Magician", "invisibility") ;


        ObjectMapper objectMapper = new ObjectMapper();

        File myFile = new File("DatosJuego.json");

        ArrayList<GameCharacter> myList = new ArrayList<>();

        try {


            myList.add(one);
            myList.add(two);
            myList.add(three);

            objectMapper.writeValue(myFile, myList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserializar el fichero

        ObjectMapper objectMapper1Deserializar = new ObjectMapper();

        // Leer desde un fichero
        GameCharacter[] nuevosJugadores = null;
        try {
            nuevosJugadores = objectMapper1Deserializar.readValue(myFile, GameCharacter[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Recorrer arrayList
        for(int i = 0; i<nuevosJugadores.length; i++){
            System.out.println(nuevosJugadores[i]);
        }


    }
}
