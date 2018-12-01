package task4;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product("BMW", 100, 14);
		Product product2 = new Product("Jeep", 300, 13);
		Product product3 = new Product("Lamborghini", 200, 12);
		Product product4 = new Product("Mersedes", 50, 8);

		Product product = new Product();
		// The most expensive product
		product.mostExpensiveProduct(product1, product2, product3, product4);

		// The biggest quantity product
		product.biggestQuantityProduct(product1, product2, product3, product4);

	}

}
