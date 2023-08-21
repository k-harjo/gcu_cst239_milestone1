package storeFront;

import inventoryManager.InventoryManager;
import shoppingCart.ShoppingCart;
import salableProduct.SalableProduct;
import java.util.ArrayList;
import java.util.List;

import inventoryManager.InventoryManager;
import shoppingCart.ShoppingCart;
import salableProduct.SalableProduct;
import java.util.List;
import java.util.ArrayList;

public class StoreFront {
    private InventoryManager inventoryManager;
    private List<ShoppingCart> shoppingCarts = new ArrayList<>();

    public StoreFront() {
        inventoryManager = new InventoryManager();
    }

    public InventoryManager getInventoryManager() { // Added method
        return inventoryManager;
    }

    public void initializeStore() {
        // Initialize the store with products
        SalableProduct product1 = new SalableProduct("Product1", "Description1", 10.0, 100);
        inventoryManager.addProduct(product1);
        // Add more products

        // Other initialization tasks
    }

    public void purchaseProduct(SalableProduct product, ShoppingCart cart) {
        if (inventoryManager.getProductList().contains(product)) {
            cart.addProduct(product);
            inventoryManager.getProductList().remove(product);
        }
    }

    public void cancelPurchase(SalableProduct product, ShoppingCart cart) {
        if (cart.getCartItems().contains(product)) {
            cart.removeProduct(product);
            inventoryManager.addProduct(product);
        }
    }

    // Other methods for StoreFront
    //Would like to add a receipt. Will output a txt file as a receipt.
}