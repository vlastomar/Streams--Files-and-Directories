import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    public static void main(String[] args) {

        try(FileInputStream in = new FileInputStream("C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\pict.jpg")) {
            FileOutputStream out = new FileOutputStream("picture-copy.jpg");

            byte[] allBytes = in.readAllBytes();
            for (int i = 0; i < allBytes.length ; i++) {
                out.write(allBytes[i]);
            }
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
