package com.formation.bankonet.models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected int identifiant;

    protected String nom;
    protected String prenom;

    @ElementCollection
    @CollectionTable(name="comptecourant", joinColumns=@JoinColumn(name="idClient"))
    protected Set<CompteCourant> compteListCourant ;


    @Transient
    protected List<Compte> compteList = new ArrayList();

    public Set<CompteCourant> getCompteListCourant() {
        return compteListCourant;
    }

    public void setCompteListCourant(Set<CompteCourant> compteListCourant) {
        this.compteListCourant = compteListCourant;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void addCompte(Compte p_compte) {
        this.compteList.add(p_compte);
    }

    public List<Compte> getCompteList() {
        return compteList;
    }

    public Compte getCompteByID(int p_compteID) {
        Compte n = null;

        int i = 0;
        while(n == null && i<getCompteList().size()) {
            if(compteList.get(i).getNumero() == p_compteID){
                n = compteList.get(i);
            }
            i++;
        }
        return n;
    }

    @Override
    public String toString() {
        return "Client{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", compteList=" + compteList +
                '}';
    }
}
