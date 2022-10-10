package bcgdv.challenge.Service;

import bcgdv.challenge.Entity.Watch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutService {
    @Autowired
    private WatchService watchService;

    public Integer calculatePrice(Integer[] ids) {
        List<Watch> watches = watchService.getWatches(ids);

        for (Watch watch:
             watches) {
            System.out.println(watch.getPrice());
        }

        return 1;
    }
}
