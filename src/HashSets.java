import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove("Volvo");
        // cars.clear(); // Menghapus semua data
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println(cars);
        System.out.println(cars.contains("BMW"));
    }
}
