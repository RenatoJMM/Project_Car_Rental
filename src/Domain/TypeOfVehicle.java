package Domain;

import java.math.BigDecimal;

public enum TypeOfVehicle {

    SMALL("SMALL", new BigDecimal("100.00")), MEDIUM("MEDIUM", new BigDecimal("150.00")),
    SUV("SUV", new BigDecimal("200.00"));

    private String description;
    private BigDecimal pricePerDay;

    TypeOfVehicle(String description, BigDecimal pricePerDay) {
        this.description = description;
        this.pricePerDay = pricePerDay;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

}
