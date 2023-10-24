package src.estrutural.bridge.v1.converters;

import src.estrutural.bridge.v1.interfaces.Converter;
import src.estrutural.bridge.v1.interfaces.Employee;

public class JsonConverter implements Converter {
    @Override
    public String getEmployeeFormatted(Employee employee) {
        StringBuilder builder = new StringBuilder();

        builder.append("{\n")
                .append("\t\"name\": \"").append(employee.getName()).append("\",\n")
                .append("\t\"age\": \"").append(employee.getAge()).append("\",\n")
                .append("\t\"salary\": \"").append(employee.getSalary()).append("\"\n")
                .append("}");
        return builder.toString();
    }
}
