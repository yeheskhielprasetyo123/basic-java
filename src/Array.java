import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Eki";
        stringArray[1] = "Pras";
        stringArray[2] = "Rakor";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] stringArray2 = new String[3];

        String[] arrayString2 = {
                "Eki", "Pras", "Rakor"
        };

        int[] intArray = new int[] {
                1,2,3,4,5
        };

        long[] longArray = {
            10,11,12,13
        };

        // operasi di array
        // array[index] = mengambil data array
        // array[index] = value | mengubah data di array
        // array.length = mengambil panjang array

        System.out.println(longArray.length);

        // array dalam array
        String[][] members = {
                {"eko", "pras", "rakor"},
                {"ada", "ini", "itu"},
                {"joko"}
        };

        System.out.println(members[0][2]);
        System.out.println(members[1][2]);
        System.out.println(members[2][0]);


    }
}
