package Kodlama.io.Kodlama.io.Devs.dataAccsess.concretes;

import Kodlama.io.Kodlama.io.Devs.dataAccsess.abstracts.SoftwareLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.SoftwareLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Repository
public class InMemorySoftwareLanguageRepository implements SoftwareLanguageRepository {

    List<SoftwareLanguage> softwareLanguages;

    private SoftwareLanguageRepository softwareLanguageRepository;

    public InMemorySoftwareLanguageRepository() {
        softwareLanguages = new ArrayList<SoftwareLanguage>();
        softwareLanguages.add(new SoftwareLanguage(1, "Java"));
        softwareLanguages.add(new SoftwareLanguage(2, "Python"));
        softwareLanguages.add(new SoftwareLanguage(3, "C#"));

    }

    @Override
    public List<SoftwareLanguage> getAll() {
        return softwareLanguages;
    }

    @Override
    public void add(SoftwareLanguage softwareLanguage) {
        int maxId = softwareLanguages.stream().max(Comparator.comparing(SoftwareLanguage::getId)).get().getId();
        softwareLanguage.setId(maxId + 1);
        softwareLanguages.add(softwareLanguage);
    }

    @Override
    public void delete(SoftwareLanguage softwareLanguage) {
        if (softwareLanguages.isEmpty()) {
            return;
        }
        for (int i = 0; i < softwareLanguages.size(); i++) {
            if (softwareLanguages.get(i).getId() == softwareLanguage.getId()) {
                softwareLanguages.remove(i);
                return;
            }
        }

    }


    @Override
    public void update(SoftwareLanguage softwareLanguage) {
        if(softwareLanguages.isEmpty()){
            return;
        }
        for(SoftwareLanguage softwareLanguage1 : softwareLanguages){
            if(softwareLanguage1.getId() == softwareLanguage.getId()){
                softwareLanguage1.setName(softwareLanguage.getName());
            }
        }
    }

    @Override
    public SoftwareLanguage getById(int id) {
        return softwareLanguages.stream().filter(softwareLanguage -> softwareLanguage.getId() == id).findFirst().orElse(null);
    }

    @Override
    public SoftwareLanguage getByName(String name) {
        return softwareLanguages.stream().filter(softwareLanguage -> softwareLanguage.getName().equals(name)).findFirst().orElse(null);
    }
}
