public class IfStatement {
    public static void main(String[] args) {

        int nilai = 70;
        int absen = 30;

        if (nilai >= 75 || absen >= 90) {
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Silahkan anda coba lagi");
        }

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai anda C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai anda D");
        } else {
            System.out.println("Nilai anda E");
        }



    }
}
