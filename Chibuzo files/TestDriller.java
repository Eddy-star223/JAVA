public class TestDriller {

	public static int numberConverter(int price) {
	/*
	int price = 0;
	for (int i = 0; i < 400 * 5 + 1; i++) {
	price = number * i;
	*/

	if (price >= 1 && price <= 4) {
	price *= 2000; 

	} else if (price >= 5 && price <= 9) {
	price *= 1800;
	
	} else if (price >= 10 && price <= 29) {
	price *= 1600;

	} else if (price >= 30 && price <= 49) {
	price *= 1500;
	
	} else if (price >= 50 && price <= 99) {
	price *= 1300;

	}else if (price >= 100 && price <= 199) {
	price *= 1200;

	}else if (price >= 200 && price <= 499) {
	price *= 1100;

	}else if (price >= 500) {
	price *= 1000;

}
	
	return price;
}	
}