import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product ID already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Product added.");
        }
    }

    // Update Product
    public void updateProduct(int productId, String name, int qty, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setProductName(name);
            product.setQuantity(qty);
            product.setPrice(price);
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // View All Products
    public void viewInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
