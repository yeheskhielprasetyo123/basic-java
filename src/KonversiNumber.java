public class KonversiNumber {
    public static void main(String[] args) {

        // widening casting (otomatis) : byte -> short -> int -> long -> float -> double
        // narrowing casting (manual) : double -> float -> long -> int -> char -> short -> byte

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        byte iniByte2 = (byte) iniInt;
    }
}
