package Challenge;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte myByte = 5;
        short myShort = 10;
        int myInt = 50;
        long longTotal = 50_000L + 10L * (myByte + myInt + myShort);

        System.out.println(longTotal);
    }
}
