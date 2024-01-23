package Pokemon;

import java.io.IOException;
import java.util.Random;

import PokemonAscii.printPokemon;

public class Fight {

    static int hpJoueur = 100;
    static int hpAdversaire = 100;
    static boolean fightContinue = true;
    static int bonusStrength;
    static int malusStrength;

   private static void malusFightAfterFight() throws InterruptedException{
        Random random = new Random();
        malusStrength = random.nextInt(3);
        switch (malusStrength){
            case 0 :
            System.out.println("\n "+ DataPkm.Data.NOM +" n'a pas été blessé.");
            break;

            case 1 : 
            System.out.println("\n "+ DataPkm.Data.NOM +" a été blessé !\n Ta force a diminué.");
            if(DataPkm.Data.FORCE > 0){
                DataPkm.Data.FORCE--;
            }
            break;

            case 2 :
            System.out.println("\n "+ DataPkm.Data.NOM +" n'a pas été blessé.");
            break;
        }
        Src.Ressources.deadTime();
   } 

    private static void bonusStatAfterFight() throws InterruptedException{
        Random random = new Random();
        bonusStrength = random.nextInt(5);
        switch (bonusStrength){
            case 0 :
            System.out.println("\n "+ DataPkm.Data.NOM +" n'a rien appris...");
            break;

            case 1 : 
            System.out.println("\n "+ DataPkm.Data.NOM +" n'a rien appris...");
            break;

            case 2 : 
            System.out.println("\n "+ DataPkm.Data.NOM +" n'a rien appris...");
            break;

            case 3 : 
            System.out.println("\n "+ DataPkm.Data.NOM +" n'a rien appris...");
            break;

            case 4 : 
            System.out.println("\n "+ DataPkm.Data.NOM +" a amélioré sa force pendant ce combat !\n Ta force a augmenté.");
            if(DataPkm.Data.FORCE < 10){
                DataPkm.Data.FORCE++;
            }
            break;
        }
        Src.Ressources.deadTime();
    }

    private static void routineFightPika() throws InterruptedException{
        System.out.println("\033[H\033[2J");
        if(hpJoueur != 100){
            System.out.println("Tu as perdu des hp !");
        }
        System.out.println("                                                                       hp : " + hpAdversaire + "\n");
        PokemonAscii.Pikachu.printPikachu();
        System.out.println("\n hp : " + hpJoueur + "\n");
        PokemonAscii.Dresseur.printDresseur();
        System.out.println("Que souhaite-tu faire ?");
        Skills.printSkills();
        System.out.println("\n  1, 2 ou 3 ?");
        returnNoPc();
        Skills.pikachuSkills();
        if (hpAdversaire <= 0){
            fightContinue = false;
            System.out.println("Bravo ! Tu as vaincu ton adversaire !");
            DataPkm.Data.NBVICTOIRE++;
            System.out.println("Tu comptabilises désormais " + DataPkm.Data.NBVICTOIRE + " victoires !");
            bonusStatAfterFight();
        }
        else if (hpJoueur <=0 ) {
            fightContinue = false;
            System.out.println("Oh non, tu t'es fais battre ! Tu feras mieux la prochaine fois.");
            malusFightAfterFight();
        }
        else {
            routineFightPika();
        }
    }

    private static void routineFightGermi() throws InterruptedException{
        System.out.println("\033[H\033[2J");
        if(hpJoueur != 100){
            System.out.println("Tu as perdu des hp !");
        }
        System.out.println("                                                                       hp : " + hpAdversaire + "\n");
        PokemonAscii.Germignon.printGermignon();
        System.out.println("\n hp : " + hpJoueur + "\n");
        PokemonAscii.Dresseur.printDresseur();
        System.out.println("Que souhaite-tu faire ?");
        Skills.printSkills();
        System.out.println("\n  1, 2 ou 3 ?");
        returnNoPc();
        Skills.germignonSkills();
        if (hpAdversaire <= 0){
            fightContinue = false;
            System.out.println("Bravo ! Tu as vaincu ton adversaire !");
            DataPkm.Data.NBVICTOIRE++;
            System.out.println("Tu comptabilises désormais " + DataPkm.Data.NBVICTOIRE + " victoires !");
            bonusStatAfterFight();
        }
        else if (hpJoueur <=0 ) {
            fightContinue = false;
            System.out.println("Oh non, tu t'es fais battre ! Tu feras mieux la prochaine fois.");
            malusFightAfterFight();
        }
        else {
            routineFightGermi();
        }
    }

    private static void routineFightSala() throws InterruptedException{
        System.out.println("\033[H\033[2J");
        if(hpJoueur != 100){
            System.out.println("Tu as perdu des hp !");
        }
        System.out.println("                                                                       hp : " + hpAdversaire + "\n");
        PokemonAscii.Salameche.printSalameche();
        System.out.println("\n hp : " + hpJoueur + "\n");
        PokemonAscii.Dresseur.printDresseur();
        System.out.println("Que souhaite-tu faire ?");
        Skills.printSkills();
        System.out.println("\n  1, 2 ou 3 ?");
        returnNoPc();
        Skills.salamecheSkills();
        if (hpAdversaire <= 0){
            fightContinue = false;
            System.out.println("Bravo ! Tu as vaincu ton adversaire !");
            DataPkm.Data.NBVICTOIRE++;
            System.out.println("Tu comptabilises désormais " + DataPkm.Data.NBVICTOIRE + " victoires !");
            bonusStatAfterFight();
        }
        else if (hpJoueur <=0 ) {
            fightContinue = false;
            System.out.println("Oh non, tu t'es fais battre ! Tu feras mieux la prochaine fois.");  
            malusFightAfterFight();
        }
        else {
            routineFightSala();
        }
    }
    
    public static void routineFightAlly() throws InterruptedException{
        System.out.println("\033[H\033[2J");
        if(hpJoueur != 100){
            System.out.println("Tu as perdu des hp !");
        }
        System.out.println("                                                                       hp : " + hpAdversaire + "\n");
        PokemonAscii.DresseurAlly.printDresseurAlly();
        System.out.println("\n hp : " + hpJoueur + "\n");
        PokemonAscii.Dresseur.printDresseur();
        System.out.println("Que souhaite-tu faire ?");
        Skills.printSkills();
        System.out.println("\n  1, 2 ou 3 ?");
        returnNoPc();
        Skills.allySkills();
        if (hpAdversaire <= 0){
            fightContinue = false;
            System.out.println("Bravo ! Tu as vaincu ton adversaire !");
            DataPkm.Data.NBVICTOIRE++;
            System.out.println("Tu comptabilises désormais " + DataPkm.Data.NBVICTOIRE + " victoires !");
            bonusStatAfterFight();
        }
        else if (hpJoueur <=0 ) {
            fightContinue = false;
            System.out.println("Oh non, tu t'es fais battre ! Tu feras mieux la prochaine fois.");
            malusFightAfterFight();
        }
        else {
            routineFightAlly();
        }
    }

    public static void printStatsAndAlly(){
        System.out.println("\033[H\033[2J");
        System.out.println("       Tu vas combattre "+ Tamamon.nameAlly + " !");
        PokemonAscii.DresseurAlly.printDresseurAlly();
        System.out.println("     Voici ses stats :");
        System.out.println("Malus attaque :                          " + Tamamon.penaltyStrengthAlly);
        System.out.println("Fatigue       :                          " + Tamamon.tirednessAlly);
        System.out.println("Faim          :                          " + Tamamon.hungerAlly);
        System.out.println("Energie       :                          " + Tamamon.energyAlly);
        System.out.println("Joie          :                          " + Tamamon.joyAlly);
        System.out.println("Propreté      :                          " + Tamamon.cleannessAlly);
        System.out.println("Force         :                          " + Tamamon.strengthAlly);
    }

    public static void returnNoPc() throws InterruptedException{
        if ((Skills.pcAtqLegeres <= 0) && (Skills.pcAtqMoyennes <= 0) && (Skills.pcAtqLourdes <=0)) {
            System.out.println("Tu ne peux plus attaquer, tu as perdu !");
        }else {
            switch(Src.Ressources.saisieString()){
                case "1" : 
                if (Skills.pcAtqLegeres > 0){
                    System.out.println("Ton Tamamon lance l'attaque !");
                    Src.Ressources.deadTime();
                    Fight.hpAdversaire = Fight.hpAdversaire - Skills.atqLegeres;
                    Skills.pcAtqLegeres --;
                }
                else {
                    System.out.println("Tu ne peux plus faire cette attaque !");
                    returnNoPc();
                }
                break;

                case "2" :
                if (Skills.pcAtqMoyennes > 0){
                    System.out.println("Ton Tamamon lance l'attaque !");
                    Src.Ressources.deadTime();
                    Fight.hpAdversaire = Fight.hpAdversaire - Skills.atqMoyennes;
                    Skills.pcAtqMoyennes --;
                }
                else {
                    System.out.println("Tu ne peux plus faire cette attaque !");
                    returnNoPc();
                }
                break;

                case "3" :
                if (Skills.pcAtqLourdes > 0){
                    System.out.println("Ton Tamamon lance l'attaque !");
                    Src.Ressources.deadTime();
                    Fight.hpAdversaire = Fight.hpAdversaire - Skills.atqLourdes;
                    Skills.pcAtqLourdes --;
                }
                else {
                    System.out.println("Tu ne peux plus faire cette attaque !");
                    returnNoPc();
                }
                break;

                default : 
                System.out.println("Ton Tamamon ne sait pas faire ça !");
                returnNoPc();
                break;
            }
        }
    }

    public static void fightTamamon() throws InterruptedException, IOException{
        //Selection Tamamon random
        System.out.print("Le dé se lance");
        Src.Ressources.deadTime();
        Random random = new Random();
        int ennemy = random.nextInt(3);
        if(ennemy == 0){
            System.out.println("\nOh ! Tu as fais 1, prépare toi à affronter Germignon !\n");
            Src.Ressources.deadTime();
            System.out.println("\033[H\033[2J");
            System.out.println("                                     Germignon :\n");
            printPokemon.printGermignon();
            System.out.println("     Rappel des stats :");
            System.out.println("Malus attaque :                          " + Tamamon.penaltyStrength);
            System.out.println("Fatigue       :                          " + Tamamon.tiredness);
            System.out.println("Faim          :                          " + Tamamon.hunger);
            System.out.println("Energie       :                          " + Tamamon.energy);
            System.out.println("Joie          :                          " + Tamamon.joy);
            System.out.println("Propreté      :                          " + Tamamon.cleanness);
            System.out.println("Force         :                          " + Tamamon.strength);

            // Combat
            System.out.println("                       Le combat commence !");
            routineFightGermi();
        }

        if(ennemy == 1){
            System.out.println("\nAh ! Tu as fais 2, prépare toi à affronter Salamèche !\n");
            Src.Ressources.deadTime();
            System.out.println("\033[H\033[2J");
            System.out.println("                                    Salamèche :\n");
            printPokemon.printSalameche();
            System.out.println("     Rappel des stats :");
            System.out.println("Malus attaque :                          " + Tamamon.penaltyStrength2);
            System.out.println("Fatigue       :                          " + Tamamon.tiredness2);
            System.out.println("Faim          :                          " + Tamamon.hunger2);
            System.out.println("Energie       :                          " + Tamamon.energy2);
            System.out.println("Joie          :                          " + Tamamon.joy2);
            System.out.println("Propreté      :                          " + Tamamon.cleanness2);
            System.out.println("Force         :                          " + Tamamon.strength2);

            // Combat
            System.out.println("                       Le combat commence !");
            routineFightSala();
        }

        if(ennemy == 2){
            System.out.println("\nOuh ! Tu as fais 3, prépare toi à affronter Pikachu !\n");
            Src.Ressources.deadTime();
            System.out.println("\033[H\033[2J");
            System.out.println("                                    Pikachu :\n");
            printPokemon.printPikachu();
            System.out.println("      Rappel des stats :");
            System.out.println("Malus attaque :                          " + Tamamon.penaltyStrength3);
            System.out.println("Fatigue       :                          " + Tamamon.tiredness3);
            System.out.println("Faim          :                          " + Tamamon.hunger3);
            System.out.println("Energie       :                          " + Tamamon.energy3);
            System.out.println("Joie          :                          " + Tamamon.joy3);
            System.out.println("Propreté      :                          " + Tamamon.cleanness3);
            System.out.println("Force         :                          " + Tamamon.strength3);

            // Combat
            System.out.println("                       Le combat commence !");
            routineFightPika();
        }    
    }
}
