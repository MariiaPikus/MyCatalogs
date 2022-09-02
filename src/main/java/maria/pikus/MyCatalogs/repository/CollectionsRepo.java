package maria.pikus.MyCatalogs.repository;


import maria.pikus.MyCatalogs.entity.Collection;
import maria.pikus.MyCatalogs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionsRepo extends JpaRepository<Collection, Long> {
    Collection findCollectionByName(String name);

    Iterable<Collection> findAllByOwner(User user);

}
