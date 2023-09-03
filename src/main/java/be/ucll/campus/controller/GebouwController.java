package be.ucll.campus.controller;

import be.ucll.campus.entity.Gebouw;
import be.ucll.campus.service.GebouwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gebouw")
public class GebouwController {

    @Autowired
    private GebouwService gebouwService;

    @GetMapping("/{id}")
    public Gebouw findGebouw(@PathVariable("id") String naam) {
        return gebouwService.findGebouw(naam);
    }

    @GetMapping("/")
    public Iterable<Gebouw> getAllgebouwen() {
        return gebouwService.getAllgebouwen();
    }

    @PostMapping("/")
    public Gebouw createGebouw(@RequestBody Gebouw gebouw) {
        gebouwService.addGebouw(gebouw);
        return gebouw;
    }

    @PutMapping("/{id}")
    public Gebouw updateGebouw(@RequestBody Gebouw gebouw, @PathVariable("id") Integer id) {
        //gebouwRepo.save(id,gebouw); TODO
        return gebouw;
    }

   /* @DeleteMapping("/{id}")
    public Gebouw updateGebouw(@PathVariable("id") Integer id){
       *//* Gebouw gebouw = gebouwRepo.getGebouw(id);
        gebouwRepo.deleteGebouw(id);*//* //TODO
        return gebouw;
    }*/


}
