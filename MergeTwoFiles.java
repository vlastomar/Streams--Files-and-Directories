import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeTwoFiles {
    public static void main(String[] args) {

        try(BufferedReader in1 = new BufferedReader(new FileReader("C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt"))) {
            List<Integer> merge = new ArrayList<>();

            Scanner scan = new Scanner(in1);
            while (scan.hasNext()){
                int temp = scan.nextInt();
                merge.add(temp);
            }
            BufferedReader in2 = new BufferedReader(new FileReader("C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt"));
            scan = new Scanner(in2);
            while (scan.hasNext()){
                int temp = scan.nextInt();
                merge.add(temp);
            }
            PrintWriter out = new PrintWriter(new FileWriter("third.txt"));
            for (int i = 0; i < merge.size() ; i++) {
                out.println(merge.get(i));
            }
            out.close();


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
