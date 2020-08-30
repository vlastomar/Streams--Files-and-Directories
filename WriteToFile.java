import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args)  {

        List symbols = List.of(',', '.', '!', '?');



        try (InputStream readFile = new FileInputStream("C:\\Users\\Vlado\\IdeaProjects\\AdvancedJavaStreamsFilesDir9\\src\\input.txt");){
            OutputStream writeFile = new FileOutputStream("output.txt");
            int charRead = 0;
            while ((charRead = readFile.read()) >= 0){
                if(!symbols.contains((char) charRead)){
                    writeFile.write(charRead);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
