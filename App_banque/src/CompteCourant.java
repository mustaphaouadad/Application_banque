import java.util.ArrayList;
import java.util.Scanner;

public class CompteCourant extends Compte {
    CompteCourant compteCourant=new CompteCourant();

    //declaration des varible
    static ArrayList<CompteCourant>compteCourants=new ArrayList<CompteCourant>();
    static double fraisBancaires;

    //objects
    Scanner scanner = new Scanner(System.in);
    Operation operation = new Operation();
    //constractos
    public CompteCourant(){}
    public CompteCourant(String numeroCompte, double soldeActuelle ,Client client){
        super(numeroCompte,soldeActuelle,client);

    }

    //declaration des methodes

    //implémentation des methodes
    @Override
    public void CreerCompte() {
        System.out.println("entrer id du client: ");
        int idClient = scanner.nextInt();
        scanner.nextLine();
        Client client = RechercheClientIdExiste(idClient);
        if(client != null){
            System.out.println("entrer le numéro du compte: ");
            String numeroCompte = scanner.nextLine();
            scanner.nextLine();
            System.out.println("entrer le solde initiale: ");
            double soldeInitiale = scanner.nextDouble();
//            scanner.nextLine();
//            double soldeActuelle = operation.CalculeSoldeActuelle();
            CompteCourant compteCourant = new CompteCourant(numeroCompte,soldeInitiale,client);
            compteCourants.add(compteCourant);
        }else {
            System.out.println("client introuvable . veuillez ajouter un client!!");
        }

    }
    public void AfficherCompt(){
        if (compteCourants.isEmpty()||compteCourants==null){
            System.out.println("Acun Compt n'est pas ajouter");
        }else {
            for (CompteCourant compteCourant:compteCourants){
                System.out.println("le numero de compt "+compteCourant.getNumeroCompte()+"le solde "+compteCourant.getSoldeActuelle()+"les clien "+compteCourant);
            }
        }
    }

}