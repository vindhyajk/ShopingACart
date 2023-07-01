import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProductWithMaxGSTAmount() {
        Product maxGSTProduct = null;
        double maxGSTAmount = 0;

        for (Product product : products) {
            double gstAmount = product.getGSTAmount();
            if (gstAmount > maxGSTAmount) {
                maxGSTAmount = gstAmount;
                maxGSTProduct = product;
            }
        }

        return maxGSTProduct;
    }

    public double getTotalAmountToBePaid() {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.getTotalPrice();
        }

        return totalAmount;
    }
}
