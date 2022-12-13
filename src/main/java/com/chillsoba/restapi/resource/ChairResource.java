package com.chillsoba.restapi.resource;

import com.chillsoba.restapi.persistence.Chair;
import com.chillsoba.restapi.service.ChairService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChairResource {

    ChairService service;
    public ChairResource(ChairService service) {
        this.service = service;
    }

    //get all chairs
    @GetMapping(value = "/product")
    public List<Chair> getChairs() {return this.service.getChairs();}

    //get chair by id
    @GetMapping(value = "/product/{id}")
    public Chair getChair(@PathVariable Long id){
        return this.service.getChair(id);
    }

    //create new chair
    @PostMapping(value = "/product")
    public Chair postChair(@RequestBody Chair chair ){
        return this.service.postChair(chair);
    }

    //update a chair by id
    @PutMapping(value = "/product/{id}", consumes = "application/json")
    public Chair update(@PathVariable Long id, @RequestBody Chair chair){
        return this.service.putChair(id, chair);
    }

    //delete by id
    @DeleteMapping(value = "/product/{id}")
    public void deleteChair(@PathVariable Long id){
        this.service.deleteChair(id);
    }
}
