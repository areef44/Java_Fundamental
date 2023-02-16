public class DoWhileLoop {
    public static void main(String[] args) {

        //do while digunakan apabila membutuhkan sekali perulangan
        var counter = 100;

        do{
            System.out.println("Perulangan Ke " + counter);
            counter++;
        }
        while(counter <= 10);
    }
}
