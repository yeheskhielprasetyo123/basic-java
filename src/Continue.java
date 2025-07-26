public class Continue  {
    public static void main(String[] args) {

        // perulangan ganjil
        for (var counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 0) {
                continue;
            }

            System.out.println("Perulangan ganjil " + counter);
        }

        // perulangan genap
        for (var counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 1) {
                continue;
            }

            System.out.println("Perulangan genap " + counter);
        }
    }
}
