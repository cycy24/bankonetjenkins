package com.formation.bankonet.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteEpargneTest extends CompteEpargne{

    @BeforeEach
    void setUp() {
        this.intitule = "Compte A";
        this.tauxInteret = 0.1;
        this.solde = 2;
    }

    @Test
    void get_intitule_retourne_intitule() {
        assertEquals(this.getIntitule(),"Compte A");
    }

    @Test
    void set_intitule_change_intitule() {
        this.setIntitule("Compte X");
        assertEquals(this.intitule,"Compte X");
    }

    @Test
    void get_solde_retourne_solde() {
        assertEquals(this.getSolde(),2);
    }

    @Test
    void set_solde_change_solde() {
        this.setSolde(100);
        assertEquals(this.solde,100);
    }

    @Test
    void get_montantDecouvertAutorise_retourne_montantDecouvertAutorise() {
        assertEquals(this.getTauxInteret(),0.1);
    }

    @Test
    void sset_montantDecouvertAutorise_retourne_montantDecouvertAutorise() {
        this.setTauxInteret(5);
        assertEquals(this.tauxInteret,5);
    }

    @Test
    void testToString() {
        assertEquals(this.toString(), "CompteEpargne{" +
                "tauxInteret=" + 0.1 +
                ", numero=" + 0 +
                ", intitule='" + "Compte A" + '\'' +
                ", solde=" + 2.0 +
                '}');
    }
}
