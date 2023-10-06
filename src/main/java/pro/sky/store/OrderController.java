package pro.sky.store;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService, Goods goods) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public void addOrder(@RequestParam("goodsId") List<Integer> goodsId) {
        orderService.addOrder(goodsId);
    }
    @GetMapping("/get")
    public List<Integer> getOrder() {
        return orderService.getOrder();
    }
}
