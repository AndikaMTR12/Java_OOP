import java.util.HashMap;

class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> bio = new HashMap<String, Integer>();

        bio.put("Andika", 23);
        bio.put("Faldan", 23);
        bio.put("Alif", 24);
        // Print keys
        for (String i : bio.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (Integer i : bio.values()) {
            System.out.println(i);
        }
        System.out.println(bio.get("Andika"));
    }
}
