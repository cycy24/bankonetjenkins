package com.formation.bankonet.repositories;

import com.formation.bankonet.models.Client;
import com.formation.bankonet.models.Compte;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ClientRepository extends CrudRepository<Client, Integer> {

    @Query("from comptecourant, compteepargne WHERE where idClient=:idClient")
    public Iterable<Compte> findCompteClient(@Param("idClient") int idClient);
}