public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 50, 75000);
        Product p2 = new Product(102, "Mouse", 150, 500);
        Product p3 = new Product(103, "Keyboard", 100, 1200);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("\n--- Inventory ---");
        manager.viewInventory();

        System.out.println("\n--- Updating Product 102 ---");
        manager.updateProduct(102, "Wireless Mouse", 180, 650);

        System.out.println("\n--- Inventory After Update ---");
        manager.viewInventory();

        System.out.println("\n--- Deleting Product 103 ---");
        manager.deleteProduct(103);

        System.out.println("\n--- Inventory After Deletion ---");
        manager.viewInventory();
    }
}
