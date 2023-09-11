package Repository;

import java.util.ArrayList;
import java.util.List;
import Domain.Rent;
import Domain.Return;

public class RentRepository implements Repository<Rent> {

    private static List<Rent> list;

    public RentRepository() {
        list = new ArrayList<Rent>();
    }

    public Rent findOne(String index) {
        int id = Integer.valueOf(index);
        for (Rent x : list) {
            if (x.getID() == id) {
                return x;
            }
        }
        return null;
    }

    @Override
    public List<Rent> findAll() {
        return list;
    }

    @Override
    public void create(Rent obj) {
        list.add(obj);
    }

    @Override
    public void delete(Rent obj) {
        list.remove(obj);
    }

    public String addReturn(Rent rent, Return ret) {
        rent.setReturnVehicle(ret);
        return "Returned made Sucessfully!";
    }

    @Override
    public String toString() {
        String result = "";
        if (list.isEmpty()) {
            result += "\nThere are no registered rents!";
        } else {
            for (int i = 0; i < list.size(); i++) {
                result += "\n" + (i + 1) + "- " + list.get(i);
            }
        }
        return result;
    }

    public String listOpens() {

        String result = "";
        int count = 0;

        if (list.isEmpty()) {

            result += "\nThere are no registered rents!";

        } else {

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getReturnVehicle() == null) {
                    result += "\n" + (i + 1) + "- " + list.get(i);
                    count++;
                }

                if (count == 0) {
                    result += "\nThere are no open Rental!";
                }
            }
        }
        return result;

    }

}
