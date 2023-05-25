public class Wrappers {
    public static void main(String[] args) {
        Integer myInt = 50;
        Double myDouble = 5.90;
        Character myChar = 'B';
        String myString = myInt.toString();

        System.out.println(myString.length());
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
    }
}
