import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Ford");
        cars.add("Wuling");
        cars.set(0, "Toyota");
        cars.remove(0); // Hapus satu data
        // cars.clear(); // Hapus semua data
        // For
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        Collections.sort(cars);
        // For each
        for (String i : cars) {
            System.out.println(i);
        }

        // Sorting array

        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println(cars.size());
    }
}