import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String telephone;
    ArrayList<Client>clients=new ArrayList<>();
    public Client(int id, String nom, String prenom,
                  String email, String adresse,String telephone) {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.adresse=adresse;
        this.telephone=telephone;
    }
   public Client(){};
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getAdresse(){
        return adresse;
    }
    public void setAdresse(String adresse){
        this.adresse=adresse;
    }
    public String getTelephone(){
        return telephone;
    }
    public void setTelphone(String telephone){
        this.telephone=telephone;
    }
    public boolean Vemail(String email){
        String regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }
    public boolean Vtelephone(String telephone){
        String phonregex=  "^(06|07)[0-9]{8}$";
        return telephone.matches(phonregex);
    }
    Scanner sc =new Scanner(System.in);
    public void AjouterClient(){
        Client client =new Client();
        System.out.println("Entrer id de Client ");
        client.setId(sc.nextInt());
        System.out.println("Entrer nom de Client ");
        client.setNom(sc.next());
        System.out.println("Entrer prenom de Client ");
        client.setPrenom(sc.next());
        String email;
        do {
            System.out.print("Entrer email de Client: ");
            email = sc.next();
            if (!Vemail(email)) {
                System.out.println(" Email non valide! Essayez encore.");
            }
        } while (!Vemail(email));
        client.setEmail(email);
        System.out.println("Entrer adresse de Client ");
        client.setAdresse(sc.next());
        String telephone;
        do {
            System.out.println("Entrer telephone de Client ");
              telephone = sc.nextLine();
            if (!Vtelephone(telephone)) {
                System.out.println(" Telephone non valide! Essayez encore.");
            }
        }while (!Vtelephone(telephone));
        client.setTelphone(telephone);

        clients.add(client);
        System.out.println("Client ajouter avec succes");
    }
    public void AfficherClient(){
        if(clients.isEmpty()|| clients == null){
            System.out.println("Acun Client n'est pas ajouter");
        }else{
        for(Client client:clients){
            System.out.println("id: "+client.getId()+" nom: "+client.getNom()+" prenom: "+client.getPrenom()+
                    " email: "+client.getEmail()+" adresse "+client.getAdresse()+" telephone: "+client.getTelephone());

        }
        }
    }




}
