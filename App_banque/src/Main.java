import java.util.Scanner;

public class Main {
    CompteCourant compteCourant = new CompteCourant();
    CompteEpargne compteEpargne = new CompteEpargne();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.println("---------------------------------Menu principal---------------------------------");
            System.out.println("1 - Gerer les Clients");
            System.out.println("2 - Gerer les Comptes Bancaires");
            System.out.println("3 - Effectuer des Operations bancaires");
            System.out.println("4 - Afficher tous les Comptes bancaires");
            System.out.println("5 - Afficher historique des operations");
            System.out.println("6 - Quitter l'application");
            System.out.print("Entrer votre choix: ");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    main.gererClient();
                    break;
                case 2:
                    main.GestCompt();
                    break;
                case 3:
                    System.out.println("Operations bancaires pas encore implementées.");
                    break;
                case 4:
                    System.out.println("Affichage des comptes pas encore implementé.");
                    break;
                case 5:
                    System.out.println("Historique des operations pas encore implementé.");
                    break;
                case 6:
                    System.out.println("Merci pour votre visite!");
                    break;
                default:
                    System.out.println("Choix incorrect, réessayez!");
                    break;
            }
        } while (choix != 6);
    }

    public void gererClient() {
        Client client = new Client();
        int choix;
        do {
            System.out.println("--------------Gestion des Clients----------------");
            System.out.println("1 - Ajouter un client");
            System.out.println("2 - Afficher les clients");
            System.out.println("3 - Retour au Menu Principal");
            System.out.print("Entrer votre choix: ");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Ajouter un client:");
                    client.AjouterClient();
                    break;
                case 2:
                    System.out.println("Afficher les clients:");
                    client.AfficherClient();
                    break;
                case 3:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide ! Réessayez.");
                    break;
            }
        } while (choix != 3);
    }

    public void GestCompt() {
        int choix;
        do {
            System.out.println("-----------Gestion des Comptes Bancaires-----------");
            System.out.println("1 - Creer un compte bancaire");
            System.out.println("2 - Afficher les informations d'un compte Courant ");
            System.out.println("3 - Afficher les informations d'un compte Epargne ");
            System.out.println("3 - Retour au Menu Principal");
            System.out.print("Entrer votre choix: ");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    int choice;
                    do {
                        System.out.println("1 - Creer un compte courant");
                        System.out.println("2 - Creer un compte epargne");
                        System.out.println("3 - Retour au Menu de gestion de comptes");
                        System.out.print("Entrer votre choix: ");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                compteCourant.CreerCompte();
                                break;
                            case 2:
                                compteEpargne.CreerCompte();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Choix invalide ! Réessayez.");
                                break;
                        }
                    } while (choice != 3);
                    break;
                case 2:
                    System.out.println("Afficher les informations d'un compte courant: ");
                    compteCourant.AfficherCompt();
                    break;
                case 3:
                    System.out.println("Afficher les informations d'un compte Epargne: ");
                    compteEpargne.AfficherCompt();
                    break;
                case 4:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide ! Réessayez.");
                    break;
            }
        } while (choix != 4);
    }
}













/*-------------------------------------------------------------------------------------------------------*/
/* import java.util.Scanner;

public class Main {
    CompteCourant compteCourant=new CompteCourant();
    CompteEpargne compteEpargne=new CompteEpargne();
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
//            System.out.println("3- Afficher rous les comptes associes");
            System.out.println("3- Retour au Menu Principal");
            choix=sc.nextInt();
            switch (choix){
                case 1:
                    System.out.println("Creer un compt bancaire");
                    int choice;
                    do {
                        System.out.println("1-Creer un compt courant");
                        System.out.println("2-Creer un compt epargne");
                        System.out.println("3- Retour au Menu de gestion de comptes");

                        System.out.println("entrer un choix");
                        choice=sc.nextInt();
                        switch (choice){
                            case 1:
                                compteCourant.CreerCompte();
                                break;
                            case 2:
                                compteEpargne.CreerCompte();
                                break;
                            case 3:
                                break;
                        }
                    }while (choice!=3);

                    break;
                case 2:
                    System.out.println("Afficher les information d'un compte");
                    break;

                case 3:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide ! Réessayez.");
                    break;
            }
        }while (choix!=4);
        }

}*/
