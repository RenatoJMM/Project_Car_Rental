package Service;

import Domain.NaturalPerson;
import Repository.NaturalPersonRepository;

public class NaturalPersonService {

    private static int COUNTER_ID;
    private static NaturalPersonRepository repo;

    public NaturalPersonService() {
        repo = new NaturalPersonRepository();
    }

    public void create(String name, String phone, String email, String cpf) {
        NaturalPerson naturalPerson = new NaturalPerson(name, phone, email, COUNTER_ID, cpf);
        repo.create(naturalPerson);
        COUNTER_ID++;
    }

    public NaturalPerson findbyCPF(String cpf) {
        return repo.findByCPF(cpf);
    }

    public String listAll() {
        return repo.toString();
    }

    public boolean verify(String cpf) {
        return repo.findByCPF(cpf) == null;
    }

    public void delete(NaturalPerson person) {
        repo.delete(person);
    }

    public void update(NaturalPerson person, String name, String phone, String email, String cpf) {
        repo.update(person, name, phone, email, cpf);
    }
}
