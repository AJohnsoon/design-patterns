package src.estrutural.bridge.v1.converters;

import src.estrutural.bridge.v1.interfaces.Converter;
import src.estrutural.bridge.v1.interfaces.Employee;

import java.util.Locale;

public class CSVConverter implements Converter {

    @Override
    public String getEmployeeFormatted(Employee employee) {
        return String.format(Locale.US,"%s,%d,%.2f",
                employee.getName(),
                employee.getAge(),
                employee.getSalary()
        );
    }
}
