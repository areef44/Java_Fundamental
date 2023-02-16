public class MethodVariableArgument {
    public static void main(String[] args) {
        ucapan("Mamat", 75,70,75,75);
        ucapan("Django", 75,75,75,75);
    }

    //variable argument menggunakan ... setelah tipe data
    static void ucapan(String nama, int... nilai){
        int total = 0;
        for(var nilai2 : nilai){
            total += nilai2;
        }
        int finalNilai = total / nilai.length;
        if(finalNilai >= 75){
            System.out.println("Selamat " + nama + ", Anda Lulus");
        }else {
            System.out.println("Maaf " + nama +", Anda Gagal");
        }
    }
}
