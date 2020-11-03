package com.formation.bankonet.models;

import javax.persistence.*;

@Entity
@Table(name="compteepargne", schema="bankonet")
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
        return "CompteEpargne{" +
                "tauxInteret=" + tauxInteret +
                ", numero=" + numero +
                ", intitule='" + intitule + '\'' +
                ", solde=" + solde +
                '}';
    }
}

