package bcgdv.challenge.Repo;

import bcgdv.challenge.Entity.Watch;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WatchRepoTest {

    @Autowired
    private WatchRepo watchRepo;

    @Test
    void findByIdIn() {
        Integer[] watchesToBeSaved = {1,2,3,4,5,2,1,3};
        var watches = watchRepo.findByIdIn(watchesToBeSaved);
        assertEquals(4, watches.size());
    }
}