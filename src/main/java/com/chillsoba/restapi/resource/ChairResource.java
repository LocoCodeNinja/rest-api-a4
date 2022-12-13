package com.chillsoba.restapi.resource;

import com.chillsoba.restapi.object.Chair;
import com.chillsoba.restapi.object.ChairRepo;
import com.chillsoba.restapi.service.ChairService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChairResource {

    ChairService service;
    public ChairResource(ChairService service) {
        this.service = service;
    }
    @GetMapping(value = "/chairs")
    public List<Chair> getChairs() {return this.service.getChairs();}

    @GetMapping(value = "/chairs/{id}")
    public Chair getChair(Integer id){
        return this.service.getChair(id);
    }

    @PostMapping(value = "/chairs")
    public Chair postChair(@RequestBody Chair chair ){
        return this.service.postChair(chair);
    }

    @PutMapping(value = "/cloths/{id}", consumes = "application/json")
    public Chair update(@PathVariable Integer id, @RequestBody Chair chair){
        return this.service.putChair(id, chair);
    }

    @DeleteMapping(value = "/cloths/{id}")
    public void deleteChair(@PathVariable Integer id){
        this.service.deleteChair(id);
    }
}
