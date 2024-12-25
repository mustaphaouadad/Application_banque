import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
//        Main main =new Main();
        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.println("---------------------------------Menu principal---------------------------------");
            System.out.println("1 - Ajouter un client");
            System.out.println("2 - Afficher les clients");

            choix = sc.nextInt();
            switch (choix) {

                case 1:
//                    Client client = new Client();
                    System.out.println("Ajouter un client: ");
                    client.AjouterClient();
                    break;
                    case 2:
//                        Client client1 = new Client();
                        System.out.println("Afficher les clients: ");
                        client.AfficherClient();
                        break;

                                case 3:
                                    System.out.println("Quitter");
                                    break;

                default:
                    System.out.println("Choix incorrect");
                    break;
            }
        }while (choix!=3);
    }
}
