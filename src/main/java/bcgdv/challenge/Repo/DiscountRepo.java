package bcgdv.challenge.Repo;

import bcgdv.challenge.Entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiscountRepo extends JpaRepository<Discount, Integer> {
    Optional<Discount> findByWatchId(Integer watchId);
}
