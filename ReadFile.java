import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) throws IOException {
    Path path = Path.of("src/input.txt") ;

    byte[] bytes = Files.readAllBytes(path);

         for(byte b : bytes){
             System.out.print(Integer.toBinaryString(b) + " ");

         }


    }
}

