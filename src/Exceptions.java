public class Exceptions {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Dibawah 18 tahun");
        } else {
            System.out.println("Cukup umur");
        }
    }

    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[5]);
        } catch (Exception e) {
            System.out.println("Somthing went wrong");
        } finally {
            System.out.println("Finished");
        }
        checkAge(16);
    }

}
