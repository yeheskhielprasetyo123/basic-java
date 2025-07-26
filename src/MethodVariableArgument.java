public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 80, 90, 80};

        // tanpa variable argument
        sayCongrats("Eko", values);

        // dengan variable argument
        sayCongratsTwo("Eki", 80,80,80,80);
        sayCongratsTwo("Eka", values);
    }

    // dengan variable argument
    static void sayCongratsTwo(String name, int... values) {
        var total = 0;

        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " Anda lulus");
        } else {
            System.out.println("Maaf anda tidak lulus");
        }
    }

    // tanpa variable argumen
    static void sayCongrats(String name, int[] values) {
        var total = 0;

        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " Anda lulus");
        } else {
            System.out.println("Maaf anda tidak lulus");
        }
    }


}
