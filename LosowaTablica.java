import java.util.Random;
import java.util.random.*;
public class LosowaTablica {
    public static void main(String[] args) {
        int Size = 10;
        Random random = new Random();
        int arr[]=new int[Size];
        for(int i=0;i<Size;i++){
            arr[i]=random.nextInt(100);
        }

        for(int i=0; i<Size;i++){
            System.out.println(arr[i]);
        }
    }
}
