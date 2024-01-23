package Src;

import java.util.Scanner;

public class Ressources {
    
    public static void deadTime() throws InterruptedException{
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".\n");
        Thread.sleep(1000);
    }

    public static String saisieString(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }

    public static void lancerDe(){
        switch(saisieString()){
            case "1":
            break;

            default : 
            System.out.println("Il faut lancer le dé !");
            lancerDe();
            break;
        }
    }

}
