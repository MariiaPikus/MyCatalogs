package maria.pikus.MyCatalogs.repos;

import maria.pikus.MyCatalogs.models.Collection;
import maria.pikus.MyCatalogs.models.User;
import org.springframework.data.repository.CrudRepository;

public interface CollectionsRepo extends CrudRepository<Collection, Long> {
    Collection findCollectionByName(String name);
    Iterable<Collection> findAllByOwner(User user);

}
