package src.estrutural.composite.v1.model;

import src.estrutural.composite.v1.interfaces.FileSystemItem;
import java.util.List;

public class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> childs;

    public Folder (String name, List<FileSystemItem> childs) {
        this.name = name;
        this.childs = childs;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        for (FileSystemItem child : childs){
            child.print(structure + "| ");
        }
    }
}
