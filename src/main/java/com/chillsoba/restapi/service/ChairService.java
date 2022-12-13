package com.chillsoba.restapi.service;

import com.chillsoba.restapi.object.ChairRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChairService {

    ChairRepo repo;

    public ChairService(ChairRepo repo) {
        this.repo = repo;
    }

}
