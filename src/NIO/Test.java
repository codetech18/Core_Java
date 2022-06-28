package NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        Path path = Paths.get("C://JAVA//input.txt");

        //getFilename method:- is used to get the name of the file
        // with the extension
        System.out.println(path.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getName(0));
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
    }
}
