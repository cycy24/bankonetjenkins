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


    public int debit(int amount){

        if((this.solde - amount) < 0-this.montantDecouvertAutorise){
            return 403;
        }else{
            this.solde = this.solde - amount;
            return 200;
        }

    }

    public int credit(int amount){

        this.solde = this.solde + amount;
        return 200;

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
