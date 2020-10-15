package com.formation.bankonet.repositories;

import com.formation.bankonet.models.Client;
import com.formation.bankonet.models.CompteCourant;
import org.springframework.data.repository.CrudRepository;

public interface CompteCourantRepository extends CrudRepository<CompteCourant, Integer> {

}