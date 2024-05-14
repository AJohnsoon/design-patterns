package src.estrutural.composite.v1.model;

import src.estrutural.composite.v1.interfaces.FileSystemItem;

import java.util.Arrays;

public class Folder implements FileSystemItem {
    private String name;
    private FileSystemItem[] childs;

    public Folder (String name, FileSystemItem[] childs) {
        this.name = name;
        this.childs = childs;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        Arrays.stream(childs).forEach(child -> child.print(structure + "| "));
    }
}
