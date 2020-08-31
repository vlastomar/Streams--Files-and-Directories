import java.io.*;
import java.util.Scanner;

public class LineNumbers {
    public static void main(String[] args) {

        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt "))) {

            PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

            Scanner scan = new Scanner(in);
            int counter = 1;
            while (scan.hasNext()){
                String line = scan.nextLine();
                out.println(String.format("%d. %s", counter, line));
                counter++;

            }
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
