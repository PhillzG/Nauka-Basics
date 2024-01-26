import java.util.Random;
import java.util.random.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int Size = random.nextInt(2,10);
        int arr[] = new int[Size];


        for(int i=0;i<Size;i++){
            arr[i]= random.nextInt(100);
        }

        for(int i =0; i<Size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
