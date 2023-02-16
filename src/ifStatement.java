public class ifStatement {
    public static void main(String[] args) {

        var nilai = 40;
        var absen = 40;

        if(nilai >= 75 && absen >= 75){
            System.out.println("Selamat Anda Lulus");
        }
        else{
            System.out.println("Anda Tidak Lulus");
        }

        if(nilai >= 80 && absen >= 80){
            System.out.println("Nilai Anda A");
        }
        else if(nilai >= 70 && absen >= 70){
            System.out.println("Nilai Anda B");
        }
        else if(nilai >= 60 && absen >= 60){
            System.out.println("Nilai Anda C");
        }
        else if(nilai >= 50 && absen >= 50){
            System.out.println("Nilai Anda D");
        }
        else{
            System.out.println("Nilai Anda E");
        }
    }
}
