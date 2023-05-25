import java.util.ArrayList;
import java.util.Iterator;

class Iterators {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        while (it.hasNext()) {
            if ("BMW" == it.next()) {
                it.remove();
            }
        }
        System.out.println(cars);
    }
}
