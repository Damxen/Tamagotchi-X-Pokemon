package DataPkm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadFile {
    
    public static int tc;

    public static void loadFriend(String namefile) throws InterruptedException, IOException{
        try {
            tc = 1;
            BufferedReader br = new BufferedReader(new FileReader(namefile + ".txt"));

            Pokemon.Tamamon.nameAlly = br.readLine();
            Pokemon.Tamamon.energyAlly = Integer.parseInt(br.readLine());
            Pokemon.Tamamon.strengthAlly = Integer.parseInt(br.readLine());
            Pokemon.Tamamon.joyAlly = Integer.parseInt(br.readLine());
            Pokemon.Tamamon.hungerAlly = Integer.parseInt(br.readLine());
            Pokemon.Tamamon.tirednessAlly = Integer.parseInt(br.readLine());
            Pokemon.Tamamon.cleannessAlly = Integer.parseInt(br.readLine());
            Pokemon.Tamamon.penaltyStrengthAlly = Integer.parseInt(br.readLine());
            br.close();
    
        } catch (Exception e) {
            tc = 2;
            System.out.println("\033[H\033[2J");
            System.out.println("  Ce Tamamon n'existe pas !\n");
            //Pokemon.Tamamon.game();
        
        }
    }

    public static void loadSave(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("Tama.txt"));

            Data.NOM = br.readLine();
            Data.ENERGIE = Integer.parseInt(br.readLine());
            Data.FORCE = Integer.parseInt(br.readLine());
            Data.JOIE = Integer.parseInt(br.readLine());
            Data.FAIM = Integer.parseInt(br.readLine());
            Data.FATIGUE = Integer.parseInt(br.readLine());
            Data.PROPRETE = Integer.parseInt(br.readLine());
            Data.NBVICTOIRE = Integer.parseInt(br.readLine());
            Data.MALUSFORCE = Integer.parseInt(br.readLine());
            Data.CPTTOUR = Integer.parseInt(br.readLine());
            br.close();

    
        } catch (Exception e) {
            //
        }
    }
}
