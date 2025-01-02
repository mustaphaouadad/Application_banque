
import java.util.Scanner;

abstract public class Compte {


    Scanner scanner = new Scanner(System.in);


    private String numeroCompte;
    private Client proprietaire;
    private String type;
    private double soldeInicile;
    private double soldeActuelle;

    public Compte(double soldeInitial) {
        this.soldeActuelle = soldeInitial >= 0 ? soldeInitial : 0;
    }

    public double getSoldeActuelle(){
        return soldeActuelle;
    }

    public void setSoldeActuelle(double soldeActuelle){
        this.soldeActuelle=soldeActuelle;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSoldeInicile() {
        return soldeInicile;
    }

    public void setSoldeInicile(double soldeInicile) {
        this.soldeInicile = soldeInicile;
    }


    public Compte (String numeroCompte,double soldeInicile,Client client){
        this.numeroCompte=numeroCompte;
        this.soldeInicile=soldeInicile;
        proprietaire=client;
        this.soldeActuelle=getSoldeActuelle();

    }
    public Compte (){}

    abstract public void CreerCompte();

    public Client RechercheClientIdExiste(int idClient){
        for (Client client : Client.clients){
            if (idClient==client.getId()){
                return client;
            }
        }
        return null;
    }
    public static Compte RechercheCompteNumero(String numeroCompte){
        for (Compte compte : CompteCourant.compteCourants){
            if (numeroCompte.equals(compte.getNumeroCompte()) ){
                return compte;
            }
        }return null;
    }
}

















































































