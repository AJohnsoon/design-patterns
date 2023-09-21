package src.criacional.prototype.v2.model;

public class User implements Cloneable {
    public String name;
    public Integer age;
    public Address address;


    public User(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User {" +
                "\n name: " + name +
                "\n age:" + age +
                "\n address: " + address +
                "\n} \n_____________________________________";
    }

    @Override
    public User clone() {
        try {

            /*Shallow Copy*/
            //return (User) super.clone();

            /* DEEPCOPY */
            User cloneable = (User) super.clone();
            cloneable.address = address.clone();
            return cloneable;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
