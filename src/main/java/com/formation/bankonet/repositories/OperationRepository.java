package com.formation.bankonet.repositories;

import com.formation.bankonet.models.CompteCourant;
import com.formation.bankonet.models.Operation;
import org.springframework.data.repository.CrudRepository;

public interface OperationRepository extends CrudRepository<Operation, Integer> {
}
