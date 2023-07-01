public class Product {
    private String name;
    private double unitPrice;
    private int gstPercentage;
    private int quantity;

    public Product(String name, double unitPrice, int gstPercentage, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.gstPercentage = gstPercentage;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        double totalPrice = unitPrice * quantity;
        if (unitPrice >= 500) {
            totalPrice -= totalPrice * 0.05; // Apply 5% discount
        }
        return totalPrice;
    }

    public double getGSTAmount() {
        return (unitPrice * gstPercentage / 100) * quantity;
    }

    // Getters and setters for the fields
}
