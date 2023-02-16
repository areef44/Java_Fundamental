public class Continue {
    public static void main(String[] args) {

        //menghentikan perulangan saat ini dan melanjutkan ke perulangan berikutnya
        for(int counter = 1; counter <= 100; counter++){
            if(counter % 2 == 1){
                continue;
            }
            System.out.println("Perulangan Ganjil-" + counter);
        }
    }
}
