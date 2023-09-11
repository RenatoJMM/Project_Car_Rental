package Repository;

import java.util.ArrayList;
import java.util.List;

import Domain.NaturalPerson;

public class NaturalPersonRepository implements Repository<NaturalPerson> {

    private static List<NaturalPerson> list;

    public NaturalPersonRepository() {
        list = new ArrayList<NaturalPerson>();
    }

    public NaturalPerson findByCPF(String cpf) {
        for (NaturalPerson x : list) {
            if (x.getCpf().equalsIgnoreCase(cpf)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public List<NaturalPerson> findAll() {
        return list;
    }

    @Override
    public void create(NaturalPerson obj) {
        list.add(obj);
    }

    @Override
    public void delete(NaturalPerson obj) {
        list.remove(obj);
    }

    public void update(NaturalPerson person, String name, String phone, String email, String cpf) {
        person.setName(name);
        person.setPhoneNumber(phone);
        person.setEmail(email);
        person.setCPF(cpf);
    }

    @Override
    public String toString() {
        String result = "Natural Persons:";
        if (list.isEmpty()) {
            result += "\nThere are no registered natural persons!";
        } else {
            for (int i = 0; i < list.size(); i++) {
                result += "\n" + (i + 1) + "- " + list.get(i);
            }
        }
        return result;
    }

}
