public abstract class Compte  {
    private String numero;
    private double solde;
    private Client proprietaire;
    public Compte(String numero, double solde, Client proprietaire){
        this.numero = numero;
        this.solde = solde;
        this.proprietaire = proprietaire;
    }

    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public double getSolde(){
        return solde;
    }
    public void setSolde(double solde){
        this.solde = solde;
    }

}
