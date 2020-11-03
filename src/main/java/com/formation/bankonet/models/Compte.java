package com.formation.bankonet.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@MappedSuperclass
public abstract class Compte {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected int numero;

    protected String intitule;
    protected double solde;

    @ManyToOne
    @JoinColumn(name = "idClient")
    protected Client client;

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
