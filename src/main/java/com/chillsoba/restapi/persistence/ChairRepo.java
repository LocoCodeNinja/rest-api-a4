package com.chillsoba.restapi.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChairRepo extends JpaRepository<Chair, Long> {
}
