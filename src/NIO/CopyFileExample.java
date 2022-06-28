package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyFileExample {
    public static void main(String[] args) throws IOException {

        Path source = Paths.get("C://JAVA//input.txt");
        Path target = Paths.get("C://JAVA//NIO//input.txt");

        Files.copy(source,target,REPLACE_EXISTING,COPY_ATTRIBUTES);

    }
}
