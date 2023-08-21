package app;

import storeFront.StoreFront;
import shoppingCart.ShoppingCart;
import inventoryManager.InventoryManager;
import salableProduct.SalableProduct;

public class StoreFrontApplication {
    public static void main(String[] args) {
        // Create a store front instance
        StoreFront store = new StoreFront();
        
        // Initialize the store with sample products
        store.initializeStore();
        SalableProduct product1 = new SalableProduct("Product1", "High-quality headphones", 49.99, 100);
        SalableProduct product2 = new SalableProduct("Product2", "Stylish backpack", 29.99, 50);
        SalableProduct product3 = new SalableProduct("Product3", "Stainless steel water bottle", 12.99, 75);
        
        // Add the sample products to the inventory
        store.getInventoryManager().addProduct(product1);
        store.getInventoryManager().addProduct(product2);
        store.getInventoryManager().addProduct(product3);
        
        // Create a shopping cart instance
        ShoppingCart cart = new ShoppingCart();
        
        // Purchase and cancel products
        store.purchaseProduct(product1, cart);
        System.out.println("Product purchased.");
        
        store.cancelPurchase(product1, cart);
        System.out.println("Purchase cancelled, product returned to inventory.");
        
        // Display final inventory
        System.out.println("\nFinal Inventory:");
        for (SalableProduct product : store.getInventoryManager().getProductList()) {
            System.out.println(product.getName() + " - " + product.getQuantity() + " available");
        }
        
        // Display cart contents
        System.out.println("\nCart Contents:");
        for (SalableProduct product : cart.getCartItems()) {
            System.out.println(product.getName());
        }
    }
}
