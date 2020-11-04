package com.formation.bankonet.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteCourantTest extends CompteCourant{

    @BeforeEach
    void setUp() {
        this.intitule = "CompteCourantTest";
        this.solde = 100;
        this.montantDecouvertAutorise = 200;
    }

    @Test
    void get_intitule_retourne_intitule() {
        assertEquals(this.getIntitule(),"CompteCourantTest");
    }

    @Test
    void set_intitule_change_intitule() {
        this.setIntitule("New CompteCourantTest");
        assertEquals(this.intitule, "New CompteCourantTest");
    }

    @Test
    void get_solde_retourne_solde() {
        assertEquals(this.getSolde(),100);
    }

    @Test
    void set_solde_change_solde() {
        this.setSolde(200);
        assertEquals(this.solde,200);
    }

    @Test
    void get_tauxInteret_retourne_tauxInteret() {
        assertEquals(this.montantDecouvertAutorise, 200);
    }

    @Test
    void set_tauxInteret_change_tauxInteret() {
        this.setMontantDecouvertAutorise(100);
        assertEquals(this.montantDecouvertAutorise, 100);
    }

    @Test
    void compte_debit_success(){
        assertEquals(this.debit(50),200);
        assertEquals(this.solde,50);
    }

    @Test
    void compte_debit_failed(){

        assertEquals(this.debit(301),403);
        assertEquals(this.solde,100);
    }

    @Test
    void compte_credit_success(){
        assertEquals(this.credit(100),200);
        assertEquals(this.solde,200);
    }

    @Test
    void testToString() {
        assertEquals(this.toString(), "CompteCourant{" +
                "montantDecouvertAutorise=" + 200.0 +
                ", numero=" + 0 +
                ", intitule='" + "CompteCourantTest" + '\'' +
                ", solde=" + 100.0 +
                '}');
    }
}