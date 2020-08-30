import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("src/input.txt"))){
            PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
            int count = 1;
            String line = in.readLine();
            while (line != null){
                if (count % 3 == 0){
                    out.println(line);
                }
                count++;
                line = in.readLine();
                out.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
