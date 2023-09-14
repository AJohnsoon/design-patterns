package src.criacional.prototype.v1.model;

import java.util.HashMap;

public class PersonSample {
    private HashMap<String, Person> samples = new HashMap<>();

    public PersonSample(){
        loadingSample();
    }

    public Person getSimple(String type) {
        return samples.get(type);
    }

    private void loadingSample(){
        samples.put("stickMan", new Person(
                "                      ",
                "        o             ",
                "       /|\\           ",
                "       / \\",
                "_______________________"
        ));
        samples.put("fatMan", new Person(
                "                       ",
                "       (^ ^)           ",
                "       <)  )\\         ",
                "       /   \\          ",
                "_______________________"
        ));
    }
}
