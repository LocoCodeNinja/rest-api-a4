package com.chillsoba.restapi.service;

import com.chillsoba.restapi.persistence.Chair;
import com.chillsoba.restapi.persistence.ChairRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChairService {

    ChairRepo repo;

    public ChairService(ChairRepo repo) {this.repo = repo;}

    public List<Chair> getChairs(){return this.repo.findAll();}

    public Chair getChair(Long id) {return this.repo.findById(id).get();}

    public Chair postChair(Chair chair) {return this.repo.save(chair);}

    public Chair putChair(Long id, Chair chair){
        Optional<Chair> object = this.repo.findById(id);

        if(object.isPresent()){
            object.get().setColour(chair.getColour());
            object.get().setMaterial(chair.getMaterial());
            object.get().setSize(chair.getSize());
            return this.repo.save(object.get());
        }
        throw new RuntimeException();
    }

    public void deleteChair(Long id) {this.repo.deleteById(id);}

}
