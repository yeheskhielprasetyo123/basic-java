public class MethodOverLoading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Eki");
        sayHello("Eki", "Eko");
    }

    static  void sayHello() {
        System.out.println("Hello World");
    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
