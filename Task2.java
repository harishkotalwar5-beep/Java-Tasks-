import java.util.Vector;

public class Task2 {
    public static void main(String[] args) {
  
        Vector<String> carModels = new Vector<>();

    
        carModels.add("Toyota Camry");
        carModels.add("Honda Civic");
        carModels.add("Ford Mustang");
        System.out.println("Car Models:");
        for (String model : carModels) {
            System.out.println(model);
        }
    }
}



