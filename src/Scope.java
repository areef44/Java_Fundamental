public class Scope {
    public static void main(String[] args) {
        sayHello("Mamat");
        sayHello("");
    }

    //dalam java variable hanya bisa diakses didalam scopenya
    static void sayHello(String name){
        String hello = "Hello " + name;

        if(!name.isBlank()){
            String hi = "Hi" + name;
            System.out.println(hi);
        }

        System.out.println(hello);

    }
}
