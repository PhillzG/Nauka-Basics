public class Trojkat {
    public static void main(String[] args) {
        int n = 5; 

        char letter = 'a';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(letter + " ");
                letter = (char)((letter + 1 - 'a') % 26 + 'a');
        
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('a' + j) + " ");
            }
            System.out.println();
    }
}
}