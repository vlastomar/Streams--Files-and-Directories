import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class SumBytes {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"))) {
            Scanner scan = new Scanner(in);
            BigInteger sumAll = new BigInteger("0");

            while (scan.hasNext()){
                String line = scan.nextLine();
                for (int i = 0; i < line.length() ; i++) {

                    sumAll =  sumAll.add(BigInteger.valueOf(line.charAt(i)));
                }
            }
            System.out.println(sumAll);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
