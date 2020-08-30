import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {



        try (InputStream in = new FileInputStream("src/input.txt")){
            OutputStream out = new FileOutputStream("output.txt");
            int oneByte = 0;
            byte[] all = in.readAllBytes();
            for (int i = 0; i < all.length; i++) {
                if (all[i] >= 0) {
                    if (all[i] == 10) {
                        out.write(10);
                    } else if (all[i] == 32) {
                        out.write(32);
                    } else {
                        String digits = String.valueOf(all[i]);
                        for (int j = 0; j < digits.length(); j++)
                            out.write(digits.charAt(j));

                    }
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
