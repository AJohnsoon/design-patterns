package src.criacional.prototype.v1;

import src.criacional.prototype.v1.model.Person;
import src.criacional.prototype.v1.model.PersonSample;

import java.util.ArrayList;
import java.util.List;

public class Client {

    protected static List<Person> iframes = new ArrayList<>();

    public static void animate() throws InterruptedException {
           System.out.println("*************************************");
           System.out.println("*");
           System.out.println("* Adjust your screen's height!");
           System.out.println("*");
           System.out.println("******************************");
           for(Person frame : iframes){
               frame.draw();
               Thread.sleep(300);
           }
           System.out.println("******************************");
           System.out.println("* The end!");
           System.out.println("*");
           System.out.println("*************************************");
    }

    public static Person moveToLeft(Person p) throws CloneNotSupportedException {
        Person person = (Person) p.clone();
        person.toLeft();
        iframes.add(person);
        return person;
    }

    public static Person moveToRight(Person p) throws CloneNotSupportedException {
        Person person = (Person) p.clone();
        person.toRight();
        iframes.add(person);
        return person;
    }


    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        PersonSample samples = new PersonSample();

        Person person = samples.getSimple("fatMan");
        iframes.add(person);
        person = moveToLeft(person);
        person = moveToLeft(person);
        person = moveToLeft(person);
        person = moveToRight(person);
        person = moveToRight(person);
        person = moveToRight(person);
        person = moveToRight(person);
        person = moveToRight(person);
        person = moveToLeft(person);
        person = moveToLeft(person);
        person = moveToLeft(person);
        moveToLeft(person);
        animate();
    }
}
