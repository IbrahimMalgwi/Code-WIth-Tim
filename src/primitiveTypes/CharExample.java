package primitiveTypes;

public class CharExample {
    public static void main(String[] args) {
        //Char is a single character
        //This can only store a single character
        //This occupies two bytes of memory or 16 bits with a width of 16
        //Used to store Unicode characters

        char myChar = 'D';
        char myUnicode = '\u0044';
        char myCopyright = '\u00A9';

        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myCopyright);
    }
}
