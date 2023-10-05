package basics;

public class primitiveDataTypeChallenge {
    public static void main(String[] args) {
        byte myByteValue = 127;
        short myShortValue = 32_000;
        int myIntValue = 69_000;

        long myLongValue = (50_000+ 10*(myByteValue+myIntValue+myShortValue));
        System.out.println((myLongValue));
    }
}
