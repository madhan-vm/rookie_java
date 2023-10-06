package basics.quiz;

public class megaBytesconverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(258);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid value");
        }

        int remainingKiloBytes = kiloBytes%1024;
        int megaBytes = kiloBytes/1024;

        System.out.println(kiloBytes+"KB = "+megaBytes+" MB and "+remainingKiloBytes+" KB");


    }
}
