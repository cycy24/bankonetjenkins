package com.formation.bankonet.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteCourantTest extends CompteCourant{

    @BeforeEach
    void setUp() {
        this.intitule = "CompteCourant";
        this.solde = 100;
        this.tauxInteret = 0.1;
    }

    @Test
    void get_intitule_retourne_intitule() {
        assertEquals(this.getIntitule(),"CompteCourant");
    }

    @Test
    void set_intitule_change_intitule() {
        this.setIntitule("New CompteCourant");
        assertEquals(this.intitule, "New CompteCourant");
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
        assertEquals(this.tauxInteret, 0.1);
    }

    @Test
    void set_tauxInteret_change_tauxInteret() {
        this.setTauxInteret(0.1);
        assertEquals(this.tauxInteret, 0.1);
    }
}