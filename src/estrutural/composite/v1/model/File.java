package src.estrutural.composite.v1.model;

import src.estrutural.composite.v1.interfaces.FileSystemItem;

public class File implements FileSystemItem {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
    }
}
