import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        if (file.exists()){
            if (file.isDirectory()){
                File[] files = file.listFiles();
                for(File f : files){
                    if (!f.isDirectory()){
                        System.out.println(String.format("%s: [%s]", f.getName(), f.length()));
                    }
                }
            }
        }
    }
}
