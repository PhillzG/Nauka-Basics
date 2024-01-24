import java.util.*;

public class EvenRand {
    public static void main(String[] args) {
        int[] rand_array = new int[10];
        for(int i =0; i<10;i++){
            Random random = new Random();
            int rand_num = random.nextInt(101);                                   
            while(rand_num%2!=0|| rand_num==0){             //sprawdza czy jest parzysta
            rand_num=random.nextInt(101);
            }
            rand_array[i] = rand_num;
            
        }
        for(int j=0;j<rand_array.length;j++){
            System.out.println(rand_array[j]);
        }
        
    }
}
