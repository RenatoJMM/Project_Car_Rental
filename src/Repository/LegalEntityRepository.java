package Repository;

import java.util.ArrayList;
import java.util.List;

import Domain.LegalEntity;

public class LegalEntityRepository implements Repository<LegalEntity> {

    private static List<LegalEntity> list;

    public LegalEntityRepository() {
        list = new ArrayList<LegalEntity>();
    }

    public LegalEntity findByCNPJ(String cnpj) {
        for (LegalEntity x : list) {
            if (x.getCnpj().equalsIgnoreCase(cnpj)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public List<LegalEntity> findAll() {
        return list;
    }

    @Override
    public void create(LegalEntity obj) {
        list.add(obj);
    }

    @Override
    public void delete(LegalEntity obj) {
        list.remove(obj);
    }

    public void update(LegalEntity person, String name, String phone, String email, String cnpj) {
        person.setName(name);
        person.setName(name);
        person.setEmail(email);
        person.setCnpj(cnpj);
    }

    @Override
    public String toString() {
        String result = "Legal Entities:";
        if (list.isEmpty()) {
            result += "\nThere are no registered legal entities!";
        } else {
            for (int i = 0; i < list.size(); i++) {
                result += "\n" + (i + 1) + "- " + list.get(i);
            }
        }
        return result;
    }

}
