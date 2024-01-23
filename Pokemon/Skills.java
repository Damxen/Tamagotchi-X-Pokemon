package Pokemon;

import java.util.Random;

public class Skills {

    public static int choixSkills;
        //Tamamon
    // Attaques légères : ViveAttaque, poudreuse, écume.
    public static int atqLegeres = 5 + DataPkm.Data.FORCE;

    public static int pcAtqLegeres = 10;

    // Attaques moyennes : Aile d'Acier, étincelle, Poing de Feu.
    public static int atqMoyennes = 10 + DataPkm.Data.FORCE;

    public static int pcAtqMoyennes = 5;

    // Attaque Lourdes : DracoSouffle, FatalFoudre, Déflagration.
    public static int  atqLourdes = 15 + DataPkm.Data.FORCE;

    public static int pcAtqLourdes = 3;

        // Pikachu :
    // Attaque légère : Eclair
    static int atqLegerePika = 5 + Tamamon.strength3, pcAtqLegerePika = 10;

    // Attaque moyenne : Coup d'Jus
    static int atqMoyennePika = 10 + Tamamon.strength3, pcAtqMoyennePika = 5;

    // Attaque lourde : Tonnerre
    static int atqLourdePika = 15 + Tamamon.strength3, pcAtqLourdePika = 3;

        // Germignon
    //Attaque légère : Charge
    static int atqLegereGermi = 5 + Tamamon.strength, pcAtqLegereGermi = 10;

    //Attaque moyenne : Feuille Magik
    static int atqMoyenneGermi = 10 + Tamamon.strength, pcAtqMoyenneGermi = 5;

    // Attaque lourde : Lance-Soleil
    static int atqLourdeGermi = 15 + Tamamon.strength, pcAtqLourdeGermi = 3;

        // Salamèche :
    // Attaque légère : Flamèche
    static int atqLegereSala = 5 + Tamamon.strength2, pcAtqLegereSala = 10;

    // Attaque moyenne : Crocs Feu
    static int atqMoyenneSala = 10 + Tamamon.strength2, pcAtqMoyenneSala = 5;

    // Attaque lourde : Feu d'Enfer
    static int atqLourdeSala= 15 + Tamamon.strength2, pcAtqLourdeSala = 3;

        //Ally :
    // Attaque légère : Choc Mental
    static int atqLegereAlly = 5 + Tamamon.strengthAlly, pcAtqLegereAlly = 10;

    // Attaque moyenne : Aurasphère
    static int atqMoyenneAlly = 10 + Tamamon.strengthAlly, pcAtqMoyenneAlly = 5;

    // Attaque lourde : Prescience
    static int atqLourdeAlly = 15 + Tamamon.strengthAlly, pcAtqLourdeAlly = 3;


    public static void pikachuSkills() throws InterruptedException{
        Random random = new Random();

        int rdmAtqPika = random.nextInt(3);
        switch(rdmAtqPika){ 
            case 0 : 
            if (pcAtqLegerePika > 0){
                System.out.println("Pikachu lance attaque Eclair !");
                Src.Ressources.deadTime();
                Fight.hpJoueur = Fight.hpJoueur - atqLegerePika;
                pcAtqLegerePika --;
            }
            else {
                pikachuSkills();
            }
            break;

            case 1 :
            if (pcAtqMoyennePika > 0){
                System.out.println("Pikachu lance attaque Coup d'Jus !");
                Src.Ressources.deadTime();
                Fight.hpJoueur = Fight.hpJoueur - atqMoyennePika;
                pcAtqMoyennePika --;
            }
            else {
                pikachuSkills();
            }
            break;

            case 2 : 
            if (pcAtqLourdePika > 0){
                System.out.println("Pikachu lance attaque Tonnerre !");
                Src.Ressources.deadTime();
                Fight.hpJoueur = Fight.hpJoueur - atqLourdePika;
                pcAtqLourdePika --;
            }
            else {
                pikachuSkills();
            }
        }
    }

    public static void germignonSkills() throws InterruptedException{
        Random random = new Random();

        int rdmAtqGermi = random.nextInt(3);
        switch(rdmAtqGermi){ 
            case 0 : 
            if (pcAtqLegereGermi > 0){
                System.out.println("Germignon lance charge !");
                Src.Ressources.deadTime();
                Fight.hpJoueur = Fight.hpJoueur - atqLegereGermi;
                pcAtqLegereGermi --;
            }
            else {
                germignonSkills();
            }
            break;

            case 1 :
            if (pcAtqMoyenneGermi > 0){
                System.out.println("Germignon lance Feuille Magik !");
                Src.Ressources.deadTime();
                Fight.hpJoueur = Fight.hpJoueur - atqMoyenneGermi;
                pcAtqMoyenneGermi --;
            }
            else {
                germignonSkills();
            }
            break;

            case 2 : 
            if (pcAtqLourdeGermi > 0){
                System.out.println("Germignon lance l'attaque Lance-Soleil !");
                Src.Ressources.deadTime();
                Fight.hpJoueur = Fight.hpJoueur - atqLourdeGermi;
                pcAtqLourdeGermi --;
            }
            else {
                germignonSkills();
            }
        }
    }

    public static void salamecheSkills() throws InterruptedException{
        Random random = new Random();

        int rdmAtqSala = random.nextInt(3);
        switch(rdmAtqSala){ 
            case 0 : 
            if (pcAtqLegereSala > 0){
                System.out.println("Salamèche lance flamèche !");
                Src.Ressources.deadTime();
                Fight.hpJoueur = Fight.hpJoueur - atqLegereSala;
                pcAtqLegereSala --;
            }
            else {
                salamecheSkills();
            }
            break;

            case 1 :
            if (pcAtqMoyenneSala > 0){
                System.out.println("Salamèche lance Crocs Feu !");
                Src.Ressources.deadTime();
                Fight.hpJoueur = Fight.hpJoueur - atqMoyenneSala;
                pcAtqMoyenneSala --;
            }
            else {
                salamecheSkills();
            }
            break;

            case 2 : 
            if (pcAtqLourdeSala > 0){
                System.out.println("Salamèche lance Feu d'Enfer !");
                Src.Ressources.deadTime();
                Fight.hpJoueur = Fight.hpJoueur - atqLourdeSala;
                pcAtqLourdeSala --;
            }
            else {
                salamecheSkills();
            }
        }
    }

    public static void allySkills() throws InterruptedException{
        Random random = new Random();

        int rdmAtqAlly = random.nextInt(3);
        switch(rdmAtqAlly){ 
            case 0 : 
            if (pcAtqLegereAlly > 0){
                System.out.println(Tamamon.nameAlly + " lance Choc Mental !");
                Src.Ressources.deadTime();
                Fight.hpJoueur = Fight.hpJoueur - atqLegereAlly;
                pcAtqLegereAlly --;
            }
            else {
                allySkills();
            }
            break;

            case 1 :
            if (pcAtqMoyenneAlly > 0){
                System.out.println(Tamamon.nameAlly +" lance Aurasphère !");
                Src.Ressources.deadTime();
                Fight.hpJoueur = Fight.hpJoueur - atqMoyenneAlly;
                pcAtqMoyenneAlly --;
            }
            else {
                allySkills();
            }
            break;

            case 2 : 
            if (pcAtqLourdeAlly > 0){
                System.out.println(Tamamon.nameAlly + " lance Prescience !");
                Src.Ressources.deadTime();
                Fight.hpJoueur = Fight.hpJoueur - atqLourdeAlly;
                pcAtqLourdeAlly --;
            }
            else {
                allySkills();
            }
        }
    }

    public static void skills1(){
        System.out.println(" 1 : Vive attaque :  Atq : " + atqLegeres + "   Pc : " + pcAtqLegeres);
        System.out.println(" 2 : Aile d'acier :  Atq : " + atqMoyennes + "  Pc : " + pcAtqMoyennes);
        System.out.println(" 3 : DracoSouffle :  Atq : " + atqLourdes + "   Pc : " + pcAtqLourdes);
        
    }

    public static void skills2(){
        System.out.println(" 1 : Poudreuse    :  Atq : " + atqLegeres + "   Pc : " + pcAtqLegeres);
        System.out.println(" 2 : Etincelle    :  Atq : " + atqMoyennes + "  Pc : " + pcAtqMoyennes);
        System.out.println(" 3 : Fatal foudre :  Atq : " + atqLourdes + "   Pc : " + pcAtqLourdes);
    }

    public static void skills3(){
        System.out.println(" 1 : Ecume        :  Atq : " + atqLegeres + "   Pc : " + pcAtqLegeres);
        System.out.println(" 2 : Poing de feu :  Atq : " + atqMoyennes + "  Pc : " + pcAtqMoyennes);
        System.out.println(" 3 : Déflagration :  Atq : " + atqLourdes + "   Pc : " + pcAtqLourdes);
    }
    
    public static void getSkills(){
        System.out.println("\033[H\033[2J");
        Fight.hpJoueur = 100;
        Fight.hpAdversaire = 100;
        Skills.pcAtqLegeres = 10;
        Skills.pcAtqMoyennes = 5;
        Skills.pcAtqLourdes = 3;
        Skills.pcAtqLegereSala = 10;
        Skills.pcAtqMoyenneSala = 5;
        Skills.pcAtqLourdeSala = 3;
        Skills.pcAtqLegereGermi = 10;
        Skills.pcAtqMoyenneGermi = 5;
        Skills.pcAtqLourdeGermi = 3;
        Skills.pcAtqLegerePika = 10;
        Skills.pcAtqMoyennePika = 5;
        Skills.pcAtqLourdePika = 3;
        System.out.println("\nChoisis tes compétences, tu as 3 choix :");
        System.out.print("\n      Choix 1 : ");
        System.out.print("                                  Choix 2 :");
        System.out.print("                                   Choix 3 :");

        System.out.print("\n Vive attaque :  Atq : " + atqLegeres + "   Pc : " + pcAtqLegeres);
        System.out.print("           Poudreuse    :  Atq : " + atqLegeres + "   Pc : " + pcAtqLegeres);
        System.out.print("           Ecume        :  Atq : " + atqLegeres + "   Pc : " + pcAtqLegeres);
        
        System.out.print("\n Aile d'acier :  Atq : " + atqMoyennes + "  Pc : " + pcAtqMoyennes);
        System.out.print("            Etincelle    :  Atq : " + atqMoyennes + "  Pc : " + pcAtqMoyennes);
        System.out.print("            Poing de feu :  Atq : " + atqMoyennes + "  Pc : " + pcAtqMoyennes);
        
        System.out.print("\n DracoSouffle :  Atq : " + atqLourdes + "  Pc : " + pcAtqLourdes);
        System.out.print("            Fatal foudre :  Atq : " + atqLourdes + "  Pc : " + pcAtqLourdes);
        System.out.print("            Déflagration :  Atq : " + atqLourdes + "  Pc : " + pcAtqLourdes);
        

        System.out.println("\n\n 1 : Choix 1     2 : Choix 2     3 : Choix 3");
        
        switch(Src.Ressources.saisieString()){
            case "1" :
            choixSkills = 1;
            System.out.println("\033[H\033[2J");
            System.out.println("Excellent choix !");
            break;

            case "2" :
            choixSkills = 2;
            System.out.println("\033[H\033[2J");
            System.out.println("Je n'aurai pas choisi mieux !");
            break;

            case "3" : 
            choixSkills = 3;
            System.out.println("\033[H\033[2J");
            System.out.println("Parfait !");
            break;

            default : 
            System.out.println("\033[H\033[2J");
            System.out.println("Ce n'est pas un choix qui existe !");
            getSkills();
        }

    }

    public static void printSkills(){
        switch(choixSkills){
            case 1 :
            Skills.skills1();
            break;

            case 2 :
            Skills.skills2();
            break;

            case 3 : 
            Skills.skills3();
            break;
        }
    }
}
