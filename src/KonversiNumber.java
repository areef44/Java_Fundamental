public class KonversiNumber {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        //konversi manual tipe data || hati2 dengan number overflow
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

        System.out.println(iniByte2);

    }
}
