package Domain;

public class Person {

    private String Name;
    private String phoneNumber;
    private String email;

    protected Person(String name, String phone, String email) {
        this.Name = name;
        this.phoneNumber = phone;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
