package shoppingCart;

import java.util.ArrayList;
import java.util.List;
import salableProduct.SalableProduct;


public class ShoppingCart {
    private List<SalableProduct> cartItems = new ArrayList<>();

    public void addProduct(SalableProduct product) {
        cartItems.add(product);
    }

    public void removeProduct(SalableProduct product) {
        cartItems.remove(product);
    }

    public List<SalableProduct> getCartItems() {
        return cartItems;
    }
    
    //Will need to update data file to reflect purchased products. 
    // Other methods for managing the shopping cart
}
