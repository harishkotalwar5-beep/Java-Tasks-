import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Phoenix");
        cities.add(2, "San Francisco");

        System.out.println("Cities List:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}




