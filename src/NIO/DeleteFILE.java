package NIO;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class DeleteFILE {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:/JAVA/Dare");
        Files.deleteIfExists(source);
    }
}
