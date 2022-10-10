package bcgdv.challenge.Service;

import bcgdv.challenge.Entity.Watch;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WatchServiceTest {
     Integer[] ids = {1, 2, 1};

     @Autowired
     private WatchService watchService;

    @Test
    void getWatches() {
        List<Watch> result = watchService.getWatches(ids);
        assertEquals(2, result.size());
    }
}