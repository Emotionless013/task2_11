package sky.pro.task2_11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    public final StoreService storeServiceImpl;

    public StoreController(StoreService storeServiceImpl) {
        this.storeServiceImpl = storeServiceImpl;
    }

    @GetMapping("/add")
    public String addToCart(@RequestParam List<Integer> ID) {
        storeServiceImpl.addToCart(ID);
        return "Добавлено в корзину";
    }

    @GetMapping("/get")
    public List<Integer> getCart(){
        return storeServiceImpl.getCart();
    }
}
