package basics.quiz;

public class MBConverter {
    public static void main(String[] args) {
        printMegaBytesandKiloBytes(1024);
    }

    public static void printMegaBytesandKiloBytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int mb = kilobytes / 1024;
        int remKilobytes = kilobytes % 1024;

        System.out.printf("%d KB = %d MB and %d KB%n", kilobytes, mb, remKilobytes);
    }
}