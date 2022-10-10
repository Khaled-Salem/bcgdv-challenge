package bcgdv.challenge.Controller;

import bcgdv.challenge.Entity.Watch;
import bcgdv.challenge.Service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomePageController {
    @Autowired
    private WatchService watchService;

    @GetMapping("/")
    public List<Watch> getAvailableWatches() {
        return watchService.getAllWatches();
    }
}
