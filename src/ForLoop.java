public class ForLoop {
    public static void main(String[] args) {

        var counter = 1;
        // for dengan kondisi
        for( ; counter <= 5; ){
            System.out.println("perulangan " + counter);
            counter++;
        }

        // for dengan init statement & kondisi
        for(var counter1 = 1; counter1 <= 5; ){
            System.out.println("perulangan " + counter1);
            counter1++;
        }

        // for dengan init statement & kondisi & post statement
        for(var counter2 = 1; counter2 <= 5;  counter2++){
            System.out.println("perulangan " + counter2);
        }
    }
}
