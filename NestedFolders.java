import java.io.File;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args) {
        String path = "C:\\Users\\Vlado\\Desktop\\Programirane\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        File file = new File(path);
         Deque<File> queue = new ArrayDeque<>();
         queue.offer(file);
            int count = 0;
         while (!queue.isEmpty()){
             File poll = queue.poll();
             count++;
             System.out.println(poll.getName());
             File[] files = poll.listFiles();
             for(File f : files){
                 if (f.isDirectory()){
                     queue.offer(f);
                 }else {
                     //System.out.println(f.getName());
                 }
             }
         }
        System.out.println(String.format("%d folders", count));


    }

}
