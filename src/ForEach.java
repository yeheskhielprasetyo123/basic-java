public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Eki", "Eko",
                "Eka", "Eku",
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("For Each");

        // for each dengan cara simple
        for (var name : names) {
            System.out.println(name);
        }
    }
}
