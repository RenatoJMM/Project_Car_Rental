package Domain;

public class LegalEntity extends Person {

    private final int ID;
    private String cnpj;

    public LegalEntity(String name, String phone, String email, int id, String cnpj) {
        super(name, phone, email);
        this.ID = id;
        this.cnpj = cnpj;
    }

    public int getID() {
        return this.ID;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + " / Phone Number: " + super.getPhoneNumber() + " / E-mail: "
                + super.getEmail() + " / CNPJ: " + this.cnpj;
    }

}
