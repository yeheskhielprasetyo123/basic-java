public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 75;
        var nilaiakhir = 75;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiakhir >= 75;

        var lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);
    }
}
