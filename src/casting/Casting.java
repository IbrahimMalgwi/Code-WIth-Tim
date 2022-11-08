package casting;

public class Casting {
    public static void main(String[] args) {
        // Casting means converting a number or treating a number from one type to another
        // This is done by putting the number in parenthesis
        int myMinIntValue = Integer.MIN_VALUE;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinIntValue / 2);

        System.out.println(myMinIntValue);
        System.out.println(myTotal);
        System.out.println(myNewByteValue);
    }
}
