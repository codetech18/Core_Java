package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class MoveFileExample {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C://JAVA//input3.txt");
        Path target = Paths.get("C://JAVA//NIO//input3.txt");

        Files.move(source,target,REPLACE_EXISTING);

    }
}
