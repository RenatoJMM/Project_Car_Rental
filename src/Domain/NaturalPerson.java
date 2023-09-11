package Domain;

public class NaturalPerson extends Person {

    private final int ID;
    private String CPF;

    public NaturalPerson(String name, String phone, String email, int id, String cpf) {
        super(name, phone, email);
        this.ID = id;
        this.CPF = cpf;
    }

    public int getID() {
        return ID;
    }

    public String getCpf() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + " / Phone Number: " + super.getPhoneNumber() + " / E-mail: "
                + super.getEmail() + " / CPF: " + this.CPF;
    }

}
