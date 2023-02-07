import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Chevrolet");
        cars.add("Nissan");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Volkswagen");
        cars.add("Ferrari");
        cars.add("Lamborghini");
        cars.add("Porsche");
        cars.add("Mclaren");
        cars.add("Bugatti");
        cars.add("Bentley");
        cars.add("Rolls Royce");
        cars.add("Jaguar");
        cars.add("Land Rover");
        cars.add("Tesla");
        
        System.out.println("Cars in the linked list: ");
        for (String car : cars) {
          System.out.println(car);
        }
      }
}
