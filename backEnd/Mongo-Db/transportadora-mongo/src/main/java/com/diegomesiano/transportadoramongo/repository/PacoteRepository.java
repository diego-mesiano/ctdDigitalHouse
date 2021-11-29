package com.diegomesiano.transportadoramongo.repository;


import com.diegomesiano.transportadoramongo.model.Pacote;
import com.diegomesiano.transportadoramongo.model.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacoteRepository extends MongoRepository<Pacote, Integer> {
    List<Pacote> findAllByStatus(Status status);

}
