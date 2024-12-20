package metier;

import java.util.*;

public class Representant {

    private int idReprsentant;
    private String prenom;
    private String nom;
    private List<Client> lesClients;

    public int getIdReprsentant(){
        return idReprsentant;
    }

    public void setIdReprsentant(int idReprsentant) {
        this.idReprsentant = idReprsentant;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Client> getLesClients() {
        return lesClients;
    }

    public void setLesClients(List<Client> lesClients) {
        this.lesClients = lesClients;
    }

    public Representant(int idRepresentant, String prenom, String nom, List<Client> lesClients) {
        setIdReprsentant(idRepresentant);
        setPrenom(prenom);
        setNom(nom);
        setLesClients(lesClients);
    }


    /**
     * Recherche un Client sur son id dans la 
     * liste des clients. 
     * Retourne le Client si trouvé, sinon retourne null
     * @param idClient
     * @return Client
     */
    public Client getClientById(int idClient) {
        /* A compléter */
        return /* A compléter */
    }

    /* getters et setters */

}
