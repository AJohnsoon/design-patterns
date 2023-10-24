package src.estrutural.bridge.v1;

import src.estrutural.bridge.v1.converters.CSVConverter;
import src.estrutural.bridge.v1.converters.JsonConverter;
import src.estrutural.bridge.v1.entities.ITGuy;
import src.estrutural.bridge.v1.entities.ProjectManager;
import src.estrutural.bridge.v1.interfaces.Converter;

public class Client {
    public static void main(String[] args) {
        Converter csvConverter = new CSVConverter();
        Converter jsonConverter = new JsonConverter();

        ProjectManager pm = new ProjectManager("Valerio Red", 48, 7513d);
        ITGuy it = new ITGuy("Alex Green", 23, 4000d);

        System.out.println(csvConverter.getEmployeeFormatted(pm));
        System.out.println(csvConverter.getEmployeeFormatted(it));
        System.out.println("\n ___________________________ \n");
        System.out.println(jsonConverter.getEmployeeFormatted(pm));
        System.out.println(jsonConverter.getEmployeeFormatted(it));
    }
}
