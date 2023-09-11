package Repository;

import java.util.ArrayList;
import java.util.List;

import Domain.Return;

public class ReturnRepository implements Repository<Return> {

    private static List<Return> list;

    public ReturnRepository() {
        list = new ArrayList<Return>();
    }

    @Override
    public List<Return> findAll() {
        return list;
    }

    @Override
    public void create(Return obj) {
        list.add(obj);
    }

    @Override
    public void delete(Return obj) {
        list.remove(obj);
    }

}
