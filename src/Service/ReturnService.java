package Service;

import java.time.LocalDateTime;
import java.util.List;

import Domain.Return;
import Repository.ReturnRepository;
import Domain.Rent;

public class ReturnService {

    private static int COUNTER_ID;
    private static ReturnRepository repo;

    public ReturnService() {
        repo = new ReturnRepository();
    }

    public void create(String location, LocalDateTime dateTime, Rent rent) {
        Return ret = new Return(COUNTER_ID, location, dateTime, rent);
        repo.create(ret);
        rent.setReturnVehicle(ret);
        rent.getVehicle().setAvailable(true);
        COUNTER_ID++;
    }

    public List<Return> listAll() {
        return repo.findAll();
    }

    public void delete(Return ret) {
        repo.delete(ret);
    }
}
