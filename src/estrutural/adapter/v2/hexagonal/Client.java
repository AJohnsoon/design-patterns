package src.estrutural.adapter.v2.hexagonal;

import src.estrutural.adapter.v2.hexagonal.controller.UserController;

import java.util.LinkedHashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        UserController restApi = new UserController();
        Map<String, String> payload = new LinkedHashMap<>();

        payload.put("name", "Alex Green");
        payload.put("email", "alexgren@email.com");
        payload.put("password", "pwd123");
        Integer statusCode = restApi.saveUser(payload);
        System.out.println("statusCode: "+ statusCode);

        statusCode = restApi.listAllUsers();
        System.out.println("\n findAll \n statusCode:" + statusCode);

        System.out.println("\n__________________________________\n");

        payload.put("name", "Maria Pink");
        payload.put("email", "mpink@email.com");
        payload.put("password", "pwd123");

        statusCode = restApi.saveUser(payload);
        System.out.println("statusCode: "+ statusCode);

        statusCode = restApi.listAllUsers();
        System.out.println("\n findAll \n statusCode:" + statusCode);

        System.out.println("\n__________________________________\n");

        payload.put("name", "Maria Purple");
        payload.put("email", "mpink@email.com");
        payload.put("password", "pwd123");

        statusCode = restApi.saveUser(payload);
        System.out.println("statusCode: "+ statusCode);

        statusCode = restApi.listAllUsers();
        System.out.println("\n findAll \n statusCode:" + statusCode);
    }

}
