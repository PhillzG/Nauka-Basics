import java.util.Random;

public class RanArray {
    public static void main(String[] args) {
        int Size = 10;
        Random random = new Random();
        int[]array = new int[Size];

        for(int i =0;i<Size;i++){
            array[i] = random.nextInt(100);
            }

        
        System.out.println("Generated Array: ");
        for (int num : array) {
            System.out.print(num + " ");                //print w jednej linijce
    }
    System.out.println("");
    for(int j=0;j<Size;j++){
        System.out.println(array[j]);                   //print w jednej kolumnie
    }
    }
}