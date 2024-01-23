package DataPkm;

import java.util.Random;
import java.util.Scanner; 

public class Data {
    

    public static String NOM;
    public static int ENERGIE = 1;
    public static int FORCE;
    public static int JOIE = 10;
    public static int FAIM;
    public static int FATIGUE;
    public static int PROPRETE = 10;
    public static int NBVICTOIRE;
    public static int MALUSFORCE;
    public static int CPTTOUR;
    public static boolean JeuxOn = true;
    public static boolean TamamonOn = false;
    public static boolean CombatOn = false;
    

    public static void ActionTour(){
        if(FAIM < 10){
            FAIM++;
        }
        if(FATIGUE < 10){
            FATIGUE++;
        }
        if (PROPRETE > 0) {
            PROPRETE--;
        }
        CPTTOUR++;
    }

    public static void ActionRandom(){
        Random random = new Random();
        int actionRdm = random.nextInt(3);
        switch(actionRdm){
            case 0 :
                if(FAIM < 10){
                    FAIM++;
                }
                break;
            case 1 :
                if(FATIGUE < 10){
                    FATIGUE++;
                }
                break;
            case 2 :
                if (PROPRETE > 0) {
                    PROPRETE--;
                }
                break;
        }
    }

    public static void ActionContrainte(){
        FORCE = CPTTOUR/10 - MALUSFORCE;
        if (FAIM > 7) {
            if(JOIE > 0){
                JOIE--;
            }
            if(FATIGUE < 10){
                FATIGUE++;
            }
            if(ENERGIE > 0){
                ENERGIE--;
            }
        }
        if (FATIGUE > 7){
            MALUSFORCE++;
            if(ENERGIE > 0){
                ENERGIE--;
            }
        }
        if (PROPRETE < 3){
            if(JOIE > 0){
                JOIE--;
            }
            if(ENERGIE > 0){
                ENERGIE--;
            }
            if(FORCE > 0){
                FORCE--;
            }
        }
        if (JOIE < 3){
            if(FATIGUE < 10){
                FATIGUE++;
            }
            if(ENERGIE > 0){
                ENERGIE--;
            }
            if(FORCE > 0){
                FORCE--;
            }
        }
    }

    /*public static boolean Affrontement(Integer forceTama1, Integer forceTama2){
        Integer AttaqueTama1 = forceTama1 + (int)(Math.random()*(10-1+1)+1);
        Integer AttaqueTama2 = forceTama2 + (int)(Math.random()*(10-1+1)+1);
        if (AttaqueTama1 > AttaqueTama2) {
            return true;
        }else {
            return false;
        }
        
    }*/

    public static void Affichestats(){
        System.out.println("\nStats de " + NOM + " : " + "\n Energie      : " + ENERGIE + "\n Force        : " + FORCE 
        + "\n Joie         : " + JOIE + "\n Faim         : " + FAIM + "\n Fatigue      : " + FATIGUE + "\n Proprete     : " 
        + PROPRETE + "\n NbVictoire   : " + NBVICTOIRE + "\n MalusForce   : " + MALUSFORCE + "\n Tour         : " 
        + CPTTOUR + "\n");
    }

    public static String inputStr() {
        try {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
        }
        catch (Exception e) {
            System.out.println("Erreur de Saisie");
            return "";
        }
    }

    public static int inputInt(){
        try {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
        }
        catch (Exception e) {
            System.out.println("Erreur de Saisie");
            return 0;
        }
    }
}