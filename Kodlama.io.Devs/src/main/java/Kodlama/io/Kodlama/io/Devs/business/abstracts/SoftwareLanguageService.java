package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageService {
    List<SoftwareLanguage> getAll();
    void add(SoftwareLanguage softwareLanguage);
    void update(SoftwareLanguage softwareLanguage);
    void delete(SoftwareLanguage softwareLanguage);
    SoftwareLanguage getById(int id);

    SoftwareLanguage getByName(String name);
}
