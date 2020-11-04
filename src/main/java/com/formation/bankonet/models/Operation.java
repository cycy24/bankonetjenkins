package com.formation.bankonet.models;

import javax.persistence.*;

@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected int numero;
    protected int id_client;
    protected double montant;
    protected String transac_type ;

    @ManyToOne
    @JoinColumn(name = "idClient")
    protected Client client;

    public int getNumero() {
        return numero;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getTransac_type() {
        return transac_type;
    }

    public void setTransac_type(String transac_type) {
        this.transac_type = transac_type;
    }
}
