package com.formation.bankonet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompteEpargne extends Compte{


    protected double tauxInteret;

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    @Override
    public String toString() {
        return "CompteCourant{" +
                "tauxInteret=" + tauxInteret +
                ", numero=" + numero +
                ", intitule='" + intitule + '\'' +
                ", solde=" + solde +
                '}';
    }
}

