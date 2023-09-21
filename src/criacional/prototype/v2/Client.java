package src.criacional.prototype.v2;

import src.criacional.prototype.v2.model.Address;
import src.criacional.prototype.v2.model.User;

public class Client {
    public static void main(String[] args) {
        User user = new User("Clone", 25, new Address("ABCD Street V1", 255, "Garden"));
        System.out.println(user);

        User cloneUser = user.clone();
        cloneUser.name = "Clone 2";
        cloneUser.address.street = "ABC Street V2";
        cloneUser.address.city = "Garden V2";
        cloneUser.address.number = 256;

        System.out.println(user);
        System.out.println(cloneUser);
    }
}
