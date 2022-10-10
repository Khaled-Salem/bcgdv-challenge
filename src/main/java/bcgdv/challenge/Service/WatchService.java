package bcgdv.challenge.Service;

import bcgdv.challenge.Entity.Watch;
import bcgdv.challenge.Repo.WatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WatchService {
    @Autowired
    private WatchRepo watchRepo;

    public Watch getWatch(Integer id) {
       Optional<Watch> optionalWatch = watchRepo.findById(id);

       return optionalWatch.orElse(null);
    }

    public List<Watch> getAllWatches() {
        return watchRepo.findAll();
    }

    public List<Watch> getWatches(Integer[] ids) {
        return watchRepo.findByIdIn(ids);
    }
}
