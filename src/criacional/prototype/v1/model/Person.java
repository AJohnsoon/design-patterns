package src.criacional.prototype.v1.model;

import java.util.Arrays;

public class Person implements Cloneable{
    private String line1;
    private String line2;
    private String line3;
    private String line4;
    private String line5;

    public Person(String line1, String line2, String line3, String line4, String line5) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
        this.line5 = line5;
    }

    public void draw(){
        for (String s : Arrays.asList("", line1, line2, line3, line4, line5)) {
            System.out.println(s);
        }

    }

    public void toLeft(){
        line1 = line1.substring(1);
        line2 = line2.substring(1);
        line3 = line3.substring(1);
        line4 = line4.substring(1);
        line5 = line5.substring(1);
    }

    public void toRight(){
        line1 = " " + line1;
        line2 = " " + line2;
        line3 = " " + line3;
        line4 = " " + line4;
        line5 = " " + line5;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
//        return new Person(line1, line2, line3, line4);
    }
}
