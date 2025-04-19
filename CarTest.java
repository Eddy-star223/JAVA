public class CarTest {
public static void main(String[] args) {

Car benz1 = new Car("4matic", "2024", 77.00);
Car benz2 = new Car("glk350", "2025", 97.00);

System.out.printf("The name of the car is %s%n the year of the car is %s%n price%.2f%n:", 
benz1.getName(), benz1.getYear(), benz1.getPrice());
System.out.printf("the name of the car is %s%n the year of the car is %s%n price %.2f%n:",
benz2.getName(), benz2.getYear(), benz2.getPrice()); 
System.out.printf("The discount is %f%n%f%n", benz1.getDiscount(), benz2.getDiscount2());  


}

}