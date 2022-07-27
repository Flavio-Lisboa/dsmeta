package com.flavio.dsmeta.repositories;

import com.flavio.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
