public class MethodReturnValue{
    public static void main(String[] args) {

        var result1 = sum(100,200,200);
        System.out.println(result1);

        var result2 = sum(300,300,400);
        System.out.println(result2);

        System.out.println(hitung(100,"+",100));
        System.out.println(hitung(400,"-",100));
        System.out.println(hitung(400,"*",100));
    }

    //jika ingin mengembalikan nilai jangan menggunakan void tapi gunakan tipe data yang ingin dikembalikan
    static int sum(int value1, int value2, int value3){
        var total = value1 + value2 + value3;
        return total;
    }

    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
