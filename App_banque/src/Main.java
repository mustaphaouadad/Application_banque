import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       Main main =new Main();
        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.println("---------------------------------Menu principal---------------------------------");
            System.out.println("1 - Gerer les Clients");
            System.out.println("2 - Gerer les Comptes Bancaires");
            System.out.println("3 - Effectuer des Operations bancaires");
            System.out.println("4 - Afficher tous les Comptes bancaires ");
            System.out.println("5 - Afficher historique des operations");
            System.out.println("6 - Quitter l'application");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
               main.gererClient();
                    break;
                    case 2:
                        main.GestCompt();
                        break;

                                case 3:

                                    break;
                default:
                    System.out.println("Choix incorrect");
                    break;
            }
        }while (choix!=5);
    }
        public void gererClient(){
        Client client = new Client();
        //Scanner sc =new Scanner(System.in);
        int choix;
            do {
                System.out.println("--------------Gestion des client----------------");
                System.out.println("1 - Ajouter un client");
                System.out.println("2 - Afficher les clients");
                System.out.println("3 - Retour au Menu Principal");
                choix=sc.nextInt();
                switch (choix) {
                    case 1:
                        System.out.println("Ajouter un client: ");
                        client.AjouterClient();
                        break;
                    case 2:
                        System.out.println("Afficher les clients: ");
                        client.AfficherClient();
                        break;
                    case 3:
                        System.out.println("Retour au menu principal...");
                        break;
                    default:
                        System.out.println("Choix invalide ! Réessayez.");
                        break;
                }
            }while (choix!=3);
        }
        public void GestCompt(){
        int choix;
        do {
            System.out.println("-----------gestion des compt bancaire-----------");
            System.out.println("1-Creer un compt bancaire");
            System.out.println("2-Afficher les information d'un compte");
            System.out.println("3- Afficher rous les comptes associes");
            System.out.println("4- Retour au Menu Principal");
            choix=sc.nextInt();
            switch (choix){
                case 1:
                    System.out.println("Creer un compt bancaire");

                    break;
                case 2:
                    System.out.println("Afficher les information d'un compte");
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide ! Réessayez.");
                    break;
            }
        }while (choix!=4);
        }

}
