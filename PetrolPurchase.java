public class PetrolPurchase {

private String location;
private String name;
private int quantity;
private double price;
private double discount;

public PetrolPurchase (String location, String name, int quantity, double price, double discount) {
this.location = location;
this.name = name;
this.quantity = quantity;
this.price = price;
this.discount = discount;

}


public void setLocation(String location) {
this.location = location;
}

public String getLocation() {
return location;
}

public void setName(String Name) {
this.Name = name;
}

public String getName() {
return Name;
}

public void setQuantity(int quantity) {
this.quantity = quantity;
}

public int getQuantity() {
return quantity;
}

public void setPrice(double price) { 
this.price = price;
}

public double getPrice() {
return price;
}

public void setDiscount(double discount) { 
this.discount = discount;
}


public double getDiscount() {
return discount;
}

public double getPurchaseAmount() {
double totalCost = (quantity * price / 100); 
double totalCost - discount;

return totalCost;
}

}