package Kodlama.io.Kodlama.io.Devs.dataAccsess.abstracts;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageRepository {
    List<SoftwareLanguage> getAll();

    void add(SoftwareLanguage softwareLanguage);
    void delete(SoftwareLanguage softwareLanguage);
    void update(SoftwareLanguage softwareLanguage);
    SoftwareLanguage getById(int id);

    SoftwareLanguage getByName(String name);
}
