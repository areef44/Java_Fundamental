public class BreakAndContinue {
    public static void main(String[] args) {

        //break digunakan untuk menghentikan looping walaupun kondisi looping masih tersedia
        var counter = 1;
        while(true){
            System.out.println("Perulangan ke-"+counter);
            counter++;

            if(counter > 20){
                break;
            }
        }
    }
}
