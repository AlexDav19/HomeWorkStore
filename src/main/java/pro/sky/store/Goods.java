package pro.sky.store;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
// Класс был создан для проверки работы.
@Repository
public class Goods {
    private final List<String> goods = new ArrayList<>(List.of("Молоко", "Хлеб", "Кефир"));

    public List<String> getGoods(List<Integer> goodsId) {
        List<String> result = new ArrayList<>();
        for (Integer integer : goodsId) {
            result.add(goods.get(integer));
        }
        return result;
    }
}
