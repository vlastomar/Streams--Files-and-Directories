import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt"))) {

            PrintWriter out = new PrintWriter(new FileWriter("results.txt"));
            Map<String, Integer> words = new LinkedHashMap<>();
            Scanner scan = new Scanner(in);
            while (scan.hasNext()) {
                String line = scan.nextLine();
                Pattern patt = Pattern.compile("(?<word>\\w+)");
                Matcher mat = patt.matcher(line);
                while (mat.find()) {
                    int count = 0;
                    String word = mat.group("word") + " ";
                    BufferedReader inSecond = new BufferedReader(new FileReader("C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt"));
                    Scanner scanSecond = new Scanner(inSecond);
                    while (scanSecond.hasNext()) {
                        String lineSecond = "";

                        lineSecond = scanSecond.nextLine();
                            Pattern patt2 = Pattern.compile(word);
                            Matcher mat2 = patt2.matcher(lineSecond);
                            while (mat2.find()) {
                                count++;
                            }


                        words.putIfAbsent(word, 0);
                        words.put(word, count);
                        //scanSecond.reset();
                        //inSecond.reset();
                    }
                }

                words.entrySet().stream()
                        .sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                        .forEach(p -> {
                            //String result = p.getKey() + " " + "-" + " " + p.getValue();
                            out.println(String.format("%s- %d", p.getKey(), p.getValue()));
                        });
            }
                out.close();


            }catch(IOException e){
                e.printStackTrace();
            }

    }
}
