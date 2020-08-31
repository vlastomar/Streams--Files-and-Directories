import java.io.*;
import java.util.Scanner;

public class CountCharacterTypes {
    public static void main(String[] args) {

        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"))) {
            PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
            Scanner scan = new Scanner(in);
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;
            while (scan.hasNext()){
                String line =  scan.nextLine();
                for (int i = 0; i < line.length() ; i++) {
                    if (line.charAt(i) != 32){
                        if (line.charAt(i) == 'a' ||line.charAt(i) == 'e' || line.charAt(i) == 'i'
                        || line.charAt(i) == 'o' || line.charAt(i) == 'u'){
                            vowels++;
                        }else if (line.charAt(i) == '!' || line.charAt(i) == ',' || line.charAt(i) == '.'
                        || line.charAt(i) == '?'){
                            punctuation++;
                        }else{
                            consonants++;
                        }
                    }
                }

            }
            out.println(String.format("Vowels: %d", vowels));
            out.println(String.format("Consonants: %d", consonants));
            out.println(String.format("Punctuation: %d", punctuation));
            out.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
