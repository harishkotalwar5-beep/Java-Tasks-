import java.util.ArrayList;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> mobileBrands = new ArrayList<>();

        // Add some mobile brands
        mobileBrands.add("Samsung");
        mobileBrands.add("Apple");
        mobileBrands.add("OnePlus");
        mobileBrands.add("Xiaomi");

        int middleIndex = mobileBrands.size() / 2;

        mobileBrands.add(middleIndex, "Google");

        System.out.println("Mobile Brands:");
        for (String brand : mobileBrands) {
            System.out.println(brand);
        }
    }
}
