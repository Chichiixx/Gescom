package metier;

import java.util.*;

public class Article {

    private int idArticle;
    private String designation;
    private Double caArticle;
    private int qteStock;
    private Double prix;
    private Tva uneTva;
    private Famille uneFamille;

    public int getIdArticle() {
        return idArticle;
    }
    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public Double getCaArticle() {
        return caArticle;
    }
    public void setCaArticle(Double caArticle) {
        this.caArticle = caArticle;
    }
    public int getQteStock() {
        return qteStock;
    }
    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }
    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public Tva getUneTva(){
        return uneTva;
    }
    public void setUneTva(Tva uneTva){
        this.uneTva=uneTva;
    }
    public Famille getUneFamille(){
        return uneFamille;
    }
    public void setUneFamille(Famille uneFamille){
        this.uneFamille=uneFamille;
    }
    
    public Article(int idArticle, String designation, double caArticle, int qteStock, double prix, Tva uneTva, Famille uneFamille) {
        setIdArticle(idArticle);
        setDesignation(designation);
        setCaArticle(caArticle);
        setQteStock(qteStock);
        setPrix(prix);
        setUneTva(uneTva);
        setUneFamille(uneFamille);
    }

}
