public class Block {
    public static void main(String[] args) {

        // block biasa digunakan untuk grouping code
        System.out.println("Hello World");
        System.out.println("Hello World 2");

        {
            System.out.println("Hello World 3");
            System.out.println("Hello World 4");

            {
                System.out.println("Hello World 5");
                System.out.println("Hello World 6");
            }
        }
    }
}
