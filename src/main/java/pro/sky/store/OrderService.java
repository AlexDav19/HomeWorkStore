package pro.sky.store;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;


import java.util.List;

@Service
@SessionScope
public class OrderService implements OrderServiceImp {
    private final List<Integer> orders;

    public OrderService(List<Integer> orders) {
        this.orders = orders;
    }

    @Override
    public void addOrder(List<Integer> goodsId) {
        orders.addAll(goodsId);
    }

    @Override
    public List<Integer> getOrder() {
        return orders;
    }

}
