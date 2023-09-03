package be.ucll.campus.controller;

import be.ucll.campus.entity.Lokaal;
import be.ucll.campus.repository.GebouwRepository;
import be.ucll.campus.repository.LokaalRepository;
import be.ucll.campus.service.LokaalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LokaalController {
    @Autowired
    private LokaalService lokaalService;

    @GetMapping("/gebouw/{gebouwid}/lokaal/{id}")
    public Lokaal findLokaal(@PathVariable("id") Long id) {
        return lokaalService.findLokaal(id);
    }

    //TODO getalllokalen voor lokalen per gebouw!
    @GetMapping("/gebouw/{gebouwid}/lokaal")
    public Iterable<Lokaal> getAllLokalen() {
        return lokaalService.getAllLokalen();
    }

    @PostMapping("/gebouw/{gebouwid}/lokaal/")
    public Lokaal createLokaal(@RequestBody Lokaal lokaal) {
        return lokaalService.addLokaal(lokaal);
        //
        /*Gebouw gebouw = gebouwRepository.findById(gebouwid).get();
        gebouw.voegLokaalToe(lokaal);
        lokaalRepo.save(lokaal);
        return lokaal;*/
    }
    /*
    @PutMapping("/{id}")
    public Lokaal updateLokaal(@RequestBody Lokaal lokaal, @PathVariable("id") Integer id){
        lokaalRepo.updateLokaal(id,lokaal);
        return lokaal;
    }

    @DeleteMapping("/{id}")
    public Lokaal updateLokaal(@PathVariable("id") Integer id){
        Lokaal lokaal = lokaalRepo.getLokaal(id);
        lokaalRepo.deleteLokaal(id);
        return lokaal;
    }*/
}
