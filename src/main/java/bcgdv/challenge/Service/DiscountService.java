package bcgdv.challenge.Service;

import bcgdv.challenge.Entity.Discount;
import bcgdv.challenge.Repo.DiscountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountService {
    @Autowired
    private DiscountRepo discountRepo;

    public Discount getDiscount(Integer id) {
        return discountRepo.findById(id).orElse(null);
    }

    public Discount getDiscountByWatchId(Integer id) {
        return discountRepo.findByWatchId(id).orElse(null);
    }

    public List<Discount> getAllDiscounts() {
        return discountRepo.findAll();
    }
}
