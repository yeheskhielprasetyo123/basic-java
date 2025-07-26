public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "E";

        switch (nilai) {
            case "A":
                System.out.println("Wow anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
                break;
        }

        // switch lambda
        switch (nilai) {
            case "A" -> System.out.println("Wow anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> System.out.println("Mungkin anda salah jurusan");
        }

        // switch tanpa yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow anda lulus dengan baik";
            case "B", "C" -> ucapan = "Nilai anda cukup baik";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> {
                ucapan = "Mungkin anda salah jurusan";
            }
        }
        System.out.println(ucapan);


        // switch dengan yield
        ucapan = switch (nilai) {
            case "A":
                yield "Wow anda lulus dengan baik";
            case "B", "C" :
                yield "Nilai anda cukup baik";
            case "D" :
                yield "Anda tidak lulus";
            default:
                yield "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
