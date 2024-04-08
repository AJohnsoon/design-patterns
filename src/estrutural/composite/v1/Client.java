package src.estrutural.composite.v1;

import src.estrutural.composite.v1.interfaces.FileSystemItem;
import src.estrutural.composite.v1.model.Folder;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        FileSystemItem file1 = new src.estrutural.composite.v1.model.File("File1.txt");
        FileSystemItem file2 = new src.estrutural.composite.v1.model.File("File2.txt");
        FileSystemItem file3 = new src.estrutural.composite.v1.model.File("File3.txt");
        FileSystemItem file4 = new src.estrutural.composite.v1.model.File("File4.txt");

        FileSystemItem sfi1 = new Folder("sf1", List.of(file1).toArray(new FileSystemItem[0]));
        FileSystemItem sfi2 = new Folder("sf2", List.of(file2, sfi1).toArray(new FileSystemItem[0]));

        FileSystemItem folder = new Folder("folder", Arrays.asList(sfi2, file3, file4).toArray(new FileSystemItem[0]));

        folder.print("");

        System.out.println("________________________");

        String dir = System.getProperty("user.dir");
        FileSystemItem fromDisk = createCompositeFromFile(new File(dir + File.separator + "src"));
        fromDisk.print(">");
    }

    public static FileSystemItem createCompositeFromFile(File file){
        if(!file.isDirectory()) return new src.estrutural.composite.v1.model.File(file.getName());
        List<FileSystemItem> childs = new ArrayList<>();
        File[] files = file.listFiles();

        assert files != null;
        for(File javaFile : files) {
            childs.add(createCompositeFromFile(javaFile));
        }
        return new Folder(file.getName(), childs.toArray(new FileSystemItem[0]));
    }
}
