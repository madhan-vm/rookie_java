package basics;
public class Casting{
    public static void main(String[] args) {
        System.out.println();

        byte mtMinByteValue = Byte.MIN_VALUE;
        System.out.println(mtMinByteValue);
        byte myNewByteValue =(byte) (mtMinByteValue/2); //Casting variable since java treats it as int and throws error.
        System.out.println("My NewByte Value is "+myNewByteValue);

        //Summary:
        /*
         * Variable are generally int 
         * short mtShort = (-128/2)  work
         */
    }
}