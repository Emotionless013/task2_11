package sky.pro.task2_11;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class ShoppingCart {
    public List<Integer> cart;

    public ShoppingCart(){
        this.cart = new ArrayList<>();
    }

    public void addToCart(List<Integer> list) {
        this.cart.addAll(list);
    }

    public List<Integer> getCart(){
        return Collections.unmodifiableList(cart);
    }
}