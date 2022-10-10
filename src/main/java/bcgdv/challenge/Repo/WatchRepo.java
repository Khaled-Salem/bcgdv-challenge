package bcgdv.challenge.Repo;

import bcgdv.challenge.Entity.Watch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WatchRepo extends JpaRepository<Watch, Integer> {

    List<Watch> findByIdIn(Integer[] ids);
}
