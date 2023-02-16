public class Method {
    public static void main(String[] args) {
        //method bisa digunakan berulang kali/reusable

        //cara memanggil method
        //ketika si main nya static si methodnya juga harus static
        cobaHelloAlkademi();
        cobaHelloAlkademi();
        cobaHelloAlkademi();
    }
    //cara membuat method
    static void cobaHelloAlkademi(){
        System.out.println("Hello Alkademi 1");
        System.out.println("Hello Alkademi 2");
        System.out.println("Hello Alkademi 3");
    }
}
