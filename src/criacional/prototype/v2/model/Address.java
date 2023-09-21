package src.criacional.prototype.v2.model;

public class Address implements Cloneable{
    public String street;
    public Integer number;
    public String city;

    public Address (String street, Integer number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    @Override
    public String toString() {
        return  "{"+
                "\n     street: " + street +
                "\n     number: " + number +
                "\n     city: " + city +
                "\n   }";
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
