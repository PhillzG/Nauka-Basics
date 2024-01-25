public class Srednia {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11}; // Przykładowa tablica
        int sum = 0;
        
        // Oblicz średnią arytmetyczną
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;

        // Znajdź element najbliższy średniej
        double closestDifference = Double.MAX_VALUE;
        int closestElement = array[0];

        for (int num : array) {
            double difference = Math.abs(num - average);
            if (difference < closestDifference) {
                closestDifference = difference;
                closestElement = num;
            }
        }

        System.out.println("Element najbliższy średniej: " + closestElement);
    }
}