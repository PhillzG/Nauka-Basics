public class DiamondPattern {
    public static void main(String[] args) {
        int n = 7; // Możesz zmienić tę wartość, aby uzyskać różne rozmiary wzoru

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Warunek sprawdzający, czy wypisać gwiazdkę czy kropkę
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println(); // Nowy wiersz po każdym wierszu wzoru
        }
    }
}