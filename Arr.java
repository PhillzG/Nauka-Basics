public class Arr {
    public static void main(String[] args) {
        //String[] cars = {"Camaro","Corvette","Tesla","Lexus"};

        // cars[2] = "Mustang";                                             // Pre wypelniona tablica
        //System.out.println(cars[3]);
        
        String[] cars = new String[3];
        cars[0] = "Camaro";
        cars[1] = "Corvette";                                               //wypelniona pozniej
        cars[2] = "Tesla";
        
        for(int i =0; i<cars.length;i++){
            System.out.println(cars[i]);
        }

    }
}
