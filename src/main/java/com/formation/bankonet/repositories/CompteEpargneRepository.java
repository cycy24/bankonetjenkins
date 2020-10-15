package com.formation.bankonet.repositories;

import com.formation.bankonet.models.CompteCourant;
import com.formation.bankonet.models.CompteEpargne;
import org.springframework.data.repository.CrudRepository;

public interface CompteEpargneRepository extends CrudRepository<CompteEpargne, Integer> {

}