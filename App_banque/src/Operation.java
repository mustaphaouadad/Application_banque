import java.util.Date;

public class Operation {
    private  String type;
     private double montant;
    private Date date;
    private Compte compte;
    public Operation(){}
    public static void effectuerDepot(Compte compte, double montant) {
        if (montant > 0) {
            double soldeActuel = compte.getSoldeInicile();
            compte.setSoldeInicile(soldeActuel + montant);
            System.out.println("Dépôt de " + montant + "dh a été effectué. Votre nouveau solde est : " + compte.getSoldeInicile() + "dh.");
        } else {
            System.out.println("Montant invalide pour le dépôt.");
        }
    }




}














