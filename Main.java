public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        // Add products to the basket
        basket.addProduct(new Product("Leather wallet", 1100, 18, 1));
        basket.addProduct(new Product("Umbrella", 900, 12, 4));
        basket.addProduct(new Product("Cigarette", 200, 28, 3));
        basket.addProduct(new Product("Honey", 100, 0, 2));

        // Find product with maximum GST amount
        Product maxGSTProduct = basket.getProductWithMaxGSTAmount();
        if (maxGSTProduct != null) {
            System.out.println("Product with maximum GST amount: " + maxGSTProduct.getGSTAmount());
        }

        // Calculate the total amount to be paids
        double totalAmountToBePaid = basket.getTotalAmountToBePaid();
        System.out.println("Total amount to be paid: " + totalAmountToBePaid);
    }
}
