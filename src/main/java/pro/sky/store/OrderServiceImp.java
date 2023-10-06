package pro.sky.store;

import java.util.List;

public interface OrderServiceImp {
    void addOrder(List<Integer> goodsId);

    List<Integer> getOrder();
}
