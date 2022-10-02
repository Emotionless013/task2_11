package sky.pro.task2_11;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    private final ShoppingCart shoppingCart;

    public StoreService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(List<Integer> list) {
        shoppingCart.addToCart(list);
    }

    public List<Integer> getCart() {
        return shoppingCart.getCart();
    }
}
