package bcgdv.challenge.Service;

import bcgdv.challenge.Entity.Discount;
import bcgdv.challenge.Entity.Watch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CheckoutService {
    @Autowired
    private WatchService watchService;
    @Autowired
    private DiscountService discountService;


    public Integer calculatePrice(Integer[] ids) {
        int price = 0;
        for (Integer id: ids) {
            Watch watch = watchService.getWatch(id);
            price += watch.getPrice();
        }
        
        return price - getDiscounts(ids);
    }

    private Integer getDiscounts(Integer[] ids) {
        int discount = 0;
        HashMap<Integer, Integer> repetitions = new HashMap<>();
        for (int i = 0; i < ids.length; i++) {
            int id = ids[i];

            if (repetitions.containsKey(id))
                repetitions.put(id, repetitions.get(id) + 1);
            else
                repetitions.put(id, 1);
        }

        for(Map.Entry<Integer, Integer> entry : repetitions.entrySet()) {
            Discount discountEntity = discountService.getDiscountByWatchId(entry.getKey());
            discount += discountEntity != null ? (entry.getValue() / discountEntity.getQuantity()) * discountEntity.getDeductedValue() : 0;
        }

        return discount;
    }
}
