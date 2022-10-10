package bcgdv.challenge.Controller;

import bcgdv.challenge.Entity.Discount;
import bcgdv.challenge.Entity.Watch;
import bcgdv.challenge.Service.DiscountService;
import bcgdv.challenge.Service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomePageController {
    @Autowired
    private WatchService watchService;

    @Autowired
    private DiscountService discountService;

    @GetMapping("/watches")
    public List<Watch> getAvailableWatches() {
        return watchService.getAllWatches();
    }

    @GetMapping("/discounts")
    public List<Discount> getAvailableDiscounts() {
        return discountService.getAllDiscounts();
    }
}
