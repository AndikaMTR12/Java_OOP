import java.util.ArrayList;
import java.util.function.Consumer;;

class Lamdas {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);

        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);

        cars.forEach((c) -> {
            System.out.println(c);
        });
    }
}