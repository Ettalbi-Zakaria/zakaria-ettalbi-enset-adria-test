package org.sid.transferservice.repositories;

import org.sid.transferservice.entities.Transfert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransfertRepository extends JpaRepository<Transfert, Long> {
}
