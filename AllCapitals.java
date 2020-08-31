import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class AllCapitals {
    public static void main(String[] args) {

        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"))) {
            PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
            Scanner scan = new Scanner(in);


            while (scan.hasNext()){
                String line = scan.nextLine();
                line = line.toUpperCase();
                out.write(line);
                out.write(10);
            }
            out.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
