package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileEx1 {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("C:/JAVA/input3.txt");
//        Files.createFile(path);

            //Create Folder
        Path path = Paths.get("C:/JAVA/NIO");
        Files.createDirectory(path);
    }
}
