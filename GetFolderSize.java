import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GetFolderSize {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        File[] files = file.listFiles();
        int sum = 0;
        for (int i = 0; i < files.length ; i++) {
            try(InputStream stream = new FileInputStream(files[i])) {
                byte[] temp = stream.readAllBytes();
                sum += temp.length;
            }catch (IOException e){
                e.printStackTrace();
            }

        }
        System.out.println(String.format("Folder size: %d", sum));
    }
}
