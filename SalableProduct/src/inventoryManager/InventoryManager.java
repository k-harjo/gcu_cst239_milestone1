package inventoryManager;

import java.util.ArrayList;
import java.util.List;
import salableProduct.SalableProduct;

public class InventoryManager {
    private List<SalableProduct> productList = new ArrayList<>();
    //most likely will read in products from input file

    public void addProduct(SalableProduct product) {
        productList.add(product);
    }

    public List<SalableProduct> getProductList() {
        return productList;
    }

    // Other methods for managing inventory
}