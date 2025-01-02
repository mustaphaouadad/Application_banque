import java.util.ArrayList;
import java.util.Scanner;

public class CompteEpargne extends Compte {

    private double tauxInteret;
    static ArrayList<CompteEpargne>compteEpargnes=new ArrayList<CompteEpargne>();
  public CompteEpargne(String numeroCompte, double soldeInitiale ,Client client){
      super(numeroCompte,soldeInitiale,client);
  }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }


    public CompteEpargne (){}


    Operation operation=new Operation();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void CreerCompte() {
        System.out.println("entrer id du client: ");
        int idClient = scanner.nextInt();
        scanner.nextLine();
        Client client = RechercheClientIdExiste(idClient);
        if (client !=null){
            System.out.println("entrer le numéro du compte: ");
            String numeroCompte = scanner.nextLine();
            System.out.println("entrer le solde initiale: ");
            double soldeIniciale = scanner.nextDouble();
            CompteEpargne compteEpargne = new CompteEpargne(numeroCompte,soldeIniciale,client);
            compteEpargnes.add(compteEpargne);

        }else {
            System.out.println("client introuvable . veuillez ajouter un client!!");
        }
    }
    public void AfficherCompt(){
        if(compteEpargnes.isEmpty()||compteEpargnes==null){
            System.out.println("Acun Compt n'est pas ajouter");
        }else {
            for(CompteEpargne compteEpargne :compteEpargnes){
                System.out.println("le numero de compt "+compteEpargne.getNumeroCompte()+" le solde "+compteEpargne.getSoldeInicile()+" client "+compteEpargne.getProprietaire().getNom());
            }
        }
    }



}
