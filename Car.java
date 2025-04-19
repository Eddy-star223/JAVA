public class Car {

private String name;
private String year;
private double price;

public Car(String name, String year, double price) {
this.name = name;
this.year = year;

if (price > 0) {
this.price = price;
}
}

public void setName (String name) {
this.name = name;
}

public String getName() {
return name;
}

public void setYear(String year) {
this.year = year;
}

public String getYear() {
return year;
}

public void setPrice(double price) {
if (price > 0){
this.price = price;
}
}

public double getPrice() {
return price;
}

public double getDiscount() {
double discount = (price * 0.05);
if (price >= 0) {
price = price - discount;
}
return price;
}

public double getDiscount2() {
double discount2 = (price * 0.07);
if (price >= 0) {
price = price - discount2;
}
return price;
}






}