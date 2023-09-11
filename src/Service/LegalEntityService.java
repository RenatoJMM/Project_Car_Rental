package Service;

import Domain.LegalEntity;
import Repository.LegalEntityRepository;

public class LegalEntityService {

    private static int COUNTER_ID;
    private static LegalEntityRepository repo;

    public LegalEntityService() {
        repo = new LegalEntityRepository();
    }

    public void create(String name, String phone, String email, String cnpj) {
        LegalEntity legalEntity = new LegalEntity(name, phone, email, COUNTER_ID, cnpj);
        repo.create(legalEntity);
        COUNTER_ID++;
    }

    public LegalEntity findByCNPJ(String name) {
        return repo.findByCNPJ(name);
    }

    public void delete(LegalEntity person) {
        repo.delete(person);
    }

    public String listAll() {
        return repo.toString();
    }

    public boolean verify(String cnpj) {
        return repo.findByCNPJ(cnpj) == null;
    }

    public void update(LegalEntity person, String name, String phone, String email, String cnpj) {
        repo.update(person, name, phone, email, cnpj);
    }

}
