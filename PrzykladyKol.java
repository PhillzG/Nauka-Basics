public class PrzykladyKol {
    public static void main(String[] args) {
        byte a = 40, b = 50;
        byte suma = (byte) ((byte)a+b);                                               //Błąd w oryginalnej analize kodu, trzeba zmienic typ byte
        System.out.println(suma);
        System.out.println("");


        System.out.println("II");
        System.out.println("");
        int x = 4;
        long y =x*4-x++;
        if(y<10)System.out.println("za malo");                                      // printuje "w sam raz"  y = 12
        else System.out.println("W sam raz");  
        
                                     
        System.out.println("");
        System.out.println("III");
        int c = 0;
        double d;
        if(a>=0) d =1.701;
        if(a<0) d=2D*3.14f;
        System.out.println(d);

    }
    
}