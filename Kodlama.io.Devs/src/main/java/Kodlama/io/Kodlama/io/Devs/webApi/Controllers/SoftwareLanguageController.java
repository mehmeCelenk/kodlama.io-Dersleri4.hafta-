package Kodlama.io.Kodlama.io.Devs.webApi.Controllers;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.SoftwareLanguageService;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/SoftwareLanguage")
public class SoftwareLanguageController {
    private SoftwareLanguageService softwareLanguageService;


    public SoftwareLanguageController(SoftwareLanguageService softwareLanguageService) {
        this.softwareLanguageService = softwareLanguageService;
    }

    @GetMapping("/getall")
    public List<SoftwareLanguage> getAll(){
        return softwareLanguageService.getAll();
    }

    @PutMapping
    public void update(@RequestBody SoftwareLanguage softwareLanguage){
        softwareLanguageService.update(softwareLanguage);
    }

    @DeleteMapping("{id}")
    public void delete(int id){
        SoftwareLanguage softwareLanguage = softwareLanguageService.getById(id);
        softwareLanguageService.delete(softwareLanguage);
    }

    @GetMapping("/getbyid/{id}")
    public SoftwareLanguage getById(@RequestParam int id){
        return  softwareLanguageService.getById(id);
    }

    @PostMapping
    public void add(@RequestBody SoftwareLanguage softwareLanguage){
       softwareLanguageService.add(softwareLanguage);
    }

    @GetMapping("/getByName/{name}")
    public SoftwareLanguage getById(String name){
        return softwareLanguageService.getByName(name);
    }

}
