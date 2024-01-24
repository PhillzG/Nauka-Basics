import java.util.Scanner;

public class Przedzialy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę do klasyfikacji:");                     
        double number = scanner.nextDouble();

        boolean isInA = number < 2 || (number > 3 && number <= 6);                  //dodaje typ boolean z info o przedialch
        boolean isInB = number >= 1 && number < 4;
        boolean isInC = (number >= 0 && number < 2) || number > 5;

        System.out.println("Liczba " + number + " należy do zbiorów:");
        if (isInA) {
            System.out.println("A");
        }
        if (isInB) {
            System.out.println("B");                                              //sprawdza czy liczba jest w przedziale
        }
        if (isInC) {
            System.out.println("C");
        }
        if (!isInA && !isInB && !isInC) {
            System.out.println("Żadnego z zbiorów");
        }
    }
}
