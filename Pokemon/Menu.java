package Pokemon;

import java.io.IOException;


public class Menu {
    public static void menuCreation() throws InterruptedException, IOException{
        System.out.println("\033[H\033[2J");
        PokemonAscii.TitleGame.printTitle();
        System.out.println("  Bienvenue !\n 1 : Nouvelle partie\n 2 : Continuer");
        switch(Src.Ressources.saisieString()){
            case "1" : 
                System.out.println("Choisissez un nom pour votre Tamamon :");
                DataPkm.Data.NOM = DataPkm.Data.inputStr();
                break;

            case "2" : 
            DataPkm.LoadFile.loadSave();
            break;

            default : 
            menuCreation();
            break;
        }
        menuLaunch();
    }
    
    public static void menuLaunch() throws InterruptedException, IOException{
        //DataPkm.Data.FORCE = DataPkm.Data.CPTTOUR/10 - DataPkm.Data.MALUSFORCE;
            while(DataPkm.Data.JeuxOn) {
            
            //Menu principal
            System.out.println("\nMenu principal :\n 1 : Gérer le Tamamon\n" + 
            " 2 : Combats de Tamamon\n 3 : Abandonner le Tamamon\n 4 : Quitter et sauvegarder");
            Integer return_menu = DataPkm.Data.inputInt();

            switch (return_menu){
                case 1 :
                    System.out.println("\033[H\033[2J");
                    DataPkm.Data.TamamonOn = true;
                    break;
                case 2 :
                    System.out.println("\033[H\033[2J");
                    Tamamon.game();
                    break;
                case 3 :
                    System.out.println("Es-tu sûr !?\n 1 : Oui\n 2 : Non");
                    Integer fin_jeux = DataPkm.Data.inputInt();
                    if (fin_jeux == 1){
                        System.out.println("\033[H\033[2J");
                        System.out.println("Eh ! On abandonne pas un Tamamon comme ça !");
                        DataPkm.Data.JeuxOn = true;
                    }
                    break;
                case 4 :
                    DataPkm.SaveFile.saveSave();
                    System.out.println("Ta partie a été correctement sauvegardée !");
                    DataPkm.Data.JeuxOn = false;
                    DataPkm.Data.CombatOn = false;
                    DataPkm.Data.TamamonOn = false;
                    break;
            }
            
            while(DataPkm.Data.TamamonOn){
                
                //Menu gérer Tamamon
                
                DataPkm.Data.Affichestats();
                
                //ACTION UTILISATEUR

                System.out.println("Choisis une action :\n 1 : Nourrir\n 2 : Sortir\n 3 : Laver\n 4 : Caresser" 
                + "\n 5 : Retour menu");
                Integer return_action = DataPkm.Data.inputInt();
                if (return_action != 5) {
                    if (return_action == 5 || DataPkm.Data.ENERGIE >= 0) {
                        switch (return_action) {
                            case 1 :
                                DataPkm.Data.FAIM = 0;
                                if (DataPkm.Data.MALUSFORCE > 0){
                                    DataPkm.Data.MALUSFORCE--;
                                }
                                System.out.println("Tu donnes à manger à " + DataPkm.Data.NOM );
                                Src.Ressources.deadTime();
                                System.out.println("\033[H\033[2J");
                                break;
                            case 2 :
                                DataPkm.Data.JOIE = 10;
                                if (DataPkm.Data.FATIGUE < 10){
                                    DataPkm.Data.FATIGUE++;
                                }
                                System.out.println("Tu vas te balader avec " + DataPkm.Data.NOM );
                                Src.Ressources.deadTime();
                                System.out.println("\033[H\033[2J");
                                break;
                            case 3 :
                                DataPkm.Data.PROPRETE = 10;
                                System.out.println("A la douche ! Tu laves " + DataPkm.Data.NOM );
                                Src.Ressources.deadTime();
                                System.out.println("\033[H\033[2J");
                                break;
                            case 4 :
                                DataPkm.Data.ENERGIE = DataPkm.Data.FORCE + DataPkm.Data.JOIE - DataPkm.Data.FAIM - DataPkm.Data.FATIGUE;
                                DataPkm.Data.FATIGUE = 0;
                                System.out.println("Tu caresses " + DataPkm.Data.NOM );
                                Src.Ressources.deadTime();
                                System.out.println("\033[H\033[2J");
                                break;
                            case 5 :
                                System.out.println("\033[H\033[2J");
                                DataPkm.Data.TamamonOn = false;
                                break;
                            
                            default :
                                System.out.println("Ce n'est pas une action valable !");
                                DataPkm.Data.TamamonOn = false;
                                break;
                        }
                    }
                
                    //ACTION TOUR
                    DataPkm.Data.ActionTour();

                    //ACTION RANDOM
                    DataPkm.Data.ActionRandom();

                    //ACTION CONTRAINTE
                    DataPkm.Data.ActionContrainte();
                }else{
                    DataPkm.Data.TamamonOn = false;
                }
            }
            
            /*while(DataPkm.Data.CombatOn = true){
                
                //Menu affrontement
                
                //System.out.println("\n" + DataPkm.Data.NOM + " a " + DataPkm.Data.NBVICTOIRE + " victoires à son actif\n");
                
                Pokemon.Tamamon.game();
            }*/
        }
    }    
}
