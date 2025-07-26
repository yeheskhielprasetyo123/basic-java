public class MethodReturnValue {
    public static void main(String[] args) {
        // cara 1
        var a = 100;
        var b = 200;
        var c = sum(a, b);
        System.out.println(c);

        // cara 2
        var result = sum(a, b);
        System.out.println(result);

        // cara 3
        System.out.println(sum(a, b));

        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(100, "-", 100));
    }

    static int sum(int a, int b) {
        var total = a + b;
        return total;
    }

    static int hitung(int a, String operasi , int b) {
        switch (operasi) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            default:
                return 0;
        }
    }
}
