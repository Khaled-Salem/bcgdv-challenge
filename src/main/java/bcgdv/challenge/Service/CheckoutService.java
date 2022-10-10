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
        HashMap<Integer, Integer> repetitions = getRepetitions(ids);
        int price = 0;

        for(Map.Entry<Integer, Integer> entry : repetitions.entrySet()) {
            int watchId = entry.getKey();
            int reps = entry.getValue();
            Watch watch = watchService.getWatch(watchId);

            int discount = calculateDiscount(watchId, reps);
            price += watch.getPrice() - discount;
        }

        return price;
    }

    private HashMap<Integer, Integer> getRepetitions(Integer[] ids) {
        HashMap<Integer, Integer> repetitions = new HashMap<>();
        for (int i = 0; i < ids.length; i++) {
            int id = ids[i];

            if (repetitions.containsKey(id))
                repetitions.put(id, repetitions.get(id) + 1);
            else
                repetitions.put(id, 1);
        }

        return repetitions;
    }

    private Integer calculateDiscount(Integer watchId, int reps) {
        Discount discountEntity = discountService.getDiscountByWatchId(watchId);

        return discountEntity != null ? (reps / discountEntity.getQuantity()) * discountEntity.getDeductedValue() : 0;
    }
}
