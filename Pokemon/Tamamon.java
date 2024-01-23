package Pokemon;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Tamamon {

    public static int energy = 5, energy2 = 5, energy3 = 5, joy = 5, joy2 =5, joy3=5, cleanness = 5, cleanness2=5, cleanness3=5;
    public static int hunger, hunger2, hunger3, tiredness,tiredness2, tiredness3, penaltyStrength,penaltyStrength2,penaltyStrength3, strength,strength2,strength3;
    public static int energyAlly, strengthAlly, joyAlly, hungerAlly, tirednessAlly, cleannessAlly, penaltyStrengthAlly;
    public static String nameAlly;


    public static void rdmStats(){
        Random random = new Random();

        //Randomisation des stats :

            // Germignon :
        penaltyStrength = random.nextInt(6);
        tiredness = random.nextInt(6);
        hunger = random.nextInt(6);
        energy = 5 + random.nextInt(6);
        joy = 5 + random.nextInt(6);
        cleanness = 5 + random.nextInt(6);
        strength = DataPkm.Data.CPTTOUR/10 - penaltyStrength;

            // Salamèche :
        penaltyStrength2 = random.nextInt(6);
        tiredness2 = random.nextInt(6);
        hunger2 = random.nextInt(6);
        energy2 = 5 + random.nextInt(6);
        joy2 = 5 + random.nextInt(6);
        cleanness2 = 5 + random.nextInt(6);
        strength2 = DataPkm.Data.CPTTOUR/10 - penaltyStrength2;

            // Pikachu :
        penaltyStrength3 = random.nextInt(6);
        tiredness3 = random.nextInt(6);
        hunger3 = random.nextInt(6);
        energy3 = 5 + random.nextInt(6);
        joy3 = 5 + random.nextInt(6);
        cleanness3 = 5 + random.nextInt(6);
        strength3 = DataPkm.Data.CPTTOUR/10 - penaltyStrength3;

        if(strength < 0) {
            strength = 0;
        }
        else if(strength2 < 0) {
            strength2 = 0;
        }
        else if(strength3 < 0) {
            strength3 = 0;
        }
    }
    

    public static void listTamamon() throws IOException {
        System.out.println("\n                                                ------- Voici vos adversaires ! ------\n");
        System.out.println("                                     Germignon :             Salamèche :             Pikachu : \n");

        // Print pokemon
        //PokemonAscii.Germignon.printGermignon();
        //PokemonAscii.Salameche.printSalameche();
        //PokemonAscii.Pikachu.printPikachu();

        // Liste des stats :
        System.out.println("Malus attaque :                          " +penaltyStrength+"                       "+penaltyStrength2+"                      "+penaltyStrength3);
        System.out.println("Fatigue       :                          " + tiredness+"                       "+tiredness2+"                      "+tiredness3);
        System.out.println("Faim          :                          " + hunger+"                       "+hunger2+"                      "+hunger3);
        System.out.println("Energie       :                          " + energy+"                       "+energy2+"                      "+energy3);
        System.out.println("Joie          :                          " + joy+"                       "+joy2+"                      "+joy3);
        System.out.println("Propreté      :                          " + cleanness+"                       "+cleanness2+"                      "+cleanness3);
        System.out.println("Force         :                          " + strength+"                       "+strength2+"                      "+strength3);
        
    }

    public static void game() throws InterruptedException, IOException{
        System.out.println("\n" + DataPkm.Data.NOM + " a " + DataPkm.Data.NBVICTOIRE + " victoires à son actif\n");
        System.out.println("   Que faire ?");
        System.out.println(" 1 : Combat solo\n 2 : Combat multijoueur\n 3 : Retour");
        switch(Src.Ressources.saisieString()){
            case "1" :
                rdmStats();
                Skills.getSkills();
                listTamamon();
                System.out.println("\n\n\n   Lance un dé pour savoir quel adversaire tu vas affronter");
                System.out.println("     1 : Lancer le dé\n");
                Src.Ressources.saisieString();
                Fight.fightTamamon();
                break;
            
            case "2" :
                System.out.println("Quel est le nom du Tama que tu veux affronter ?");
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                DataPkm.LoadFile.loadFriend(s);
                switch(DataPkm.LoadFile.tc){
                    case 1 : 
                    Fight.hpAdversaire = 100;
                    Fight.hpJoueur = 100;
                    Skills.pcAtqLegeres = 10;
                    Skills.pcAtqMoyennes = 5;
                    Skills.pcAtqLourdes = 3;
                    Skills.pcAtqLegereAlly = 10;
                    Skills.pcAtqMoyenneAlly = 5;
                    Skills.pcAtqLourdeAlly = 3;
                    Fight.printStatsAndAlly();
                    System.out.println("\n 1 : Continuer");
                    Src.Ressources.saisieString();
                    Skills.getSkills();
                    Fight.routineFightAlly();
                    break;

                    case 2 : 
                    game();
                    break;

                    default :
                    break;
                }
                /*Fight.printStatsAndAlly();
                System.out.println("\n 1 : Continuer");
                Src.Ressources.saisieString();
                Skills.getSkills();
                Fight.routineFightAlly();
                break;*/

            case "3" : 
                Menu.menuLaunch();
                break;
            default :
                System.out.println("\033[H\033[2J");
                System.out.println("Entrée inconnue !");
                game();
                break;
        }
    }

    
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("\033[H\033[2J");
        Pokemon.Menu.menuCreation();
    }

}