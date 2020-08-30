import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractIntgers {
    public static void main(String[] args) {

        try(InputStream in = new FileInputStream("src/input.txt")){
            OutputStream out = new FileOutputStream("output.txt");
            int oneByte = 0;
            Scanner scan = new Scanner(in);
               while (scan.hasNext()){
                       String line = scan.nextLine();
                       Pattern patt = Pattern.compile(" (?<intI>[0-9]+) ");
                       Matcher mat = patt.matcher(line);
                       while (mat.find()){
                           String temp = mat.group("intI");
                           for (int i = 0; i < temp.length() ; i++) {
                               out.write(temp.charAt(i));
                           }
                           out.write(10);
                       }

                }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
