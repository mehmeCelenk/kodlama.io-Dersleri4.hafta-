package Kodlama.io.Kodlama.io.Devs.business.concretes;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.SoftwareLanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccsess.abstracts.SoftwareLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {
    private SoftwareLanguageRepository softwareLanguageRepository;


    public SoftwareLanguageManager(SoftwareLanguageRepository softwareLanguageRepository) {
        this.softwareLanguageRepository = softwareLanguageRepository;
    }

    @Override
    public List<SoftwareLanguage> getAll() {
        return softwareLanguageRepository.getAll();
    }

    @Override
    public void add(SoftwareLanguage softwareLanguage){
        if(!isValid(softwareLanguage)){
            return;
        }
        softwareLanguageRepository.add(softwareLanguage);
    }

    @Override
    public void update(SoftwareLanguage softwareLanguage) {
        if(!isValid(softwareLanguage)){
            return;
        }
        softwareLanguageRepository.update(softwareLanguage);
    }

    @Override
    public void delete(SoftwareLanguage softwareLanguage) {
        if(softwareLanguage == null || getById(softwareLanguage.getId()) == null){
            return;
        }
        softwareLanguageRepository.delete(softwareLanguage);
    }

    @Override
    public SoftwareLanguage getById(int id) {
        return softwareLanguageRepository.getById(id);
    }

    @Override
    public SoftwareLanguage getByName(String name) {
        return softwareLanguageRepository.getByName(name);
    }

    private boolean isValid(SoftwareLanguage softwareLanguage){
        return !(softwareLanguage == null || getByName(softwareLanguage.getName()) != null || softwareLanguage.getName().isEmpty());
    }
}
