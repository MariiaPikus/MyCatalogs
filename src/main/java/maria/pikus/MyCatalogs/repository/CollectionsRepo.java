package maria.pikus.MyCatalogs.repository;


import maria.pikus.MyCatalogs.entity.Collection;
import org.springframework.data.repository.CrudRepository;

public interface CollectionsRepo extends CrudRepository<Collection, Long> {
    Collection findCollectionByName(String name);

}
