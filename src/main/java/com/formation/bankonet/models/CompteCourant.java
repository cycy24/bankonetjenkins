package com.formation.bankonet.models;

import javax.persistence.*;

@Entity
@Table(name="comptecourant", schema="bankonet")
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
        return "CompteCourant{" +
                "montantDecouvertAutorise=" + montantDecouvertAutorise +
                ", numero=" + numero +
                ", intitule='" + intitule + '\'' +
                ", solde=" + solde +
                '}';
    }
}
