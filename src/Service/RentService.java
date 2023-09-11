package Service;

import java.time.LocalDateTime;

import Domain.Rent;
import Domain.Vehicle;
import Domain.Person;
import Domain.Return;
import Repository.RentRepository;

public class RentService {

    private static int COUNTER_ID;
    private static RentRepository repo;

    public RentService() {
        repo = new RentRepository();
    }

    public void create(String location, LocalDateTime dateTime, Vehicle vehicle, Person person) {
        Rent rent = new Rent(COUNTER_ID, location, dateTime, vehicle, person);
        repo.create(rent);
        vehicle.setAvailable(false);
        COUNTER_ID++;
    }

    public Rent find(int index) {
        String id = String.valueOf(index);
        return repo.findOne(id);
    }

    public String listAll() {
        return repo.toString();
    }

    public String listOpens() {
        return repo.listOpens();
    }

    public void delete(Rent rent) {
        repo.delete(rent);
    }

    public void addReturn(Rent rent, Return ret) {
        repo.addReturn(rent, ret);
    }
}
