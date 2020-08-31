import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;

public class SerializeArrayList {
    public static void main(String[] args) {
        List<Double> example = List.of(10.2, 20.3, 15.6);
            example.
             try(ObjectInputStream in = new ObjectInputStream( )) {

             }catch (IOException e){
                 e.printStackTrace();
             }

    }
}
