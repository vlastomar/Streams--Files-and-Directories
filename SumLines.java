import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) {


        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"))) {
            Scanner scan = new Scanner(in);
            while (scan.hasNext()){
                String line = scan.nextLine();
                int sum = 0;
                for (int i = 0; i < line.length() ; i++) {
                    sum += (int)line.charAt(i);
                }
                System.out.println(sum);

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
