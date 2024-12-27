
import java.util.ArrayList;
import java.util.Scanner;

abstract public class Compte {

    //objects
    Scanner scanner = new Scanner(System.in);

    //declaration des variable
    //static int id;
    private String numeroCompte;
    private Client proprietaire;
    private String type;
    private double soldeInicile;
    private double soldeActuelle;

    //getter and setter

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

    //constractors
    public Compte (String numeroCompte,double soldeActuelle,Client client){
        this.numeroCompte=numeroCompte;
        this.soldeActuelle=soldeActuelle;
        proprietaire=client;

    }
    public Compte (){}

    //definition de la methode CreerCompte
    abstract public void CreerCompte();


    //fonction recherche client
    public Client RechercheClientIdExiste(int idClient){
        for (Client client : Client.clients){
            if (idClient==client.getId()){
                return client;
            }
        }
        return null;
    }



}
































//import java.util.Scanner;
//
//public abstract class Compte  {
//    private String numero;
//    private double solde;
//    private Client proprietaire;
//    public Compte(String numero, double solde, Client proprietaire){
//        this.numero = numero;
//        this.solde = solde;
//        this.proprietaire = proprietaire;
//    }
//    public Compte(){};
//    CompteCourant compteCourant=new CompteCourant();
//
//
//    public String getNumero(){
//        return numero;
//    }
//    public void setNumero(String numero){
//        this.numero = numero;
//    }
//    public double getSolde(){
//        return solde;
//    }
//    public void setSolde(double solde){
//        this.solde = solde;
//    }
//
//    public Client getProprietaire() {
//        return proprietaire;
//    }
//
//    public void setProprietaire(Client proprietaire) {
//        this.proprietaire = proprietaire;
//    }
//
//
//}
















































//    public boolean Vncompt(String numero){
//        String Ncompt = "^[0-9]{2,24}$";
//        return numero.matches(Ncompt);
//    }
//    public void CreeCompte() {
//        Scanner sc =new Scanner(System.in);
//        String nemoro;
//        do {
//            System.out.println("entrer numéro de compte : ");
//            nemoro=sc.nextLine();
//
//            if (!Vncompt(nemoro)){
//                System.out.println(" Nemoro non valide! Essayez encore.");
//
//            }
//          setNumero(nemoro);
//        }while (!Vncompt(nemoro));
//
//
//
//
//
//        System.out.println("entrer le solde initiale : ");
//        double sld = sc.nextDouble();
//
//
//        System.out.println("choisir le type de votre compte : " +
//                "\n 1-Compte Epargne :" +
//                "\n 2-Compte Courant :");
//        int choix = sc.nextInt();
//        if(choix==1){
//            System.out.println("entrer le fraisbancaire : ");
//            double fraisBancaire = sc.nextDouble();
//            comptes.add(new CompteCourant(nmr, sld, Client.proprietaire(), fraisBancaire));
//
//        } else if(choix==2){
//            System.out.println("entrer le  tauxInteret : ");
//            double  tauxInteret = sc.nextDouble();
//            comptes.add(new CompteEpargne(nmr, sld, Client.proprietaire(), tauxInteret));
//
//        }
//
//    }