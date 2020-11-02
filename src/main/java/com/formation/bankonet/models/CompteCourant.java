package com.formation.bankonet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompteCourant extends Compte{

    protected double montantDecouvertAutorise;

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "montantDecouvertAutorise=" + montantDecouvertAutorise +
                ", numero=" + numero +
                ", intitule='" + intitule + '\'' +
                ", solde=" + solde +
                '}';
    }
}
