package com.chillsoba.restapi.object;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChairRepo extends JpaRepository<Chair, Integer> {
}
