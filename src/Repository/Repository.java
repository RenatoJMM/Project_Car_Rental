package Repository;

import java.util.List;

public interface Repository<T> {

    public List<T> findAll();

    public void create(T obj);

    public void delete(T obj);

}
