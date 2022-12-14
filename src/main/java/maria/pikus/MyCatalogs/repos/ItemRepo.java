package maria.pikus.MyCatalogs.repos;

import maria.pikus.MyCatalogs.models.Collection;
import maria.pikus.MyCatalogs.models.Item;
import maria.pikus.MyCatalogs.models.Tag;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepo extends CrudRepository<Item, Long> {
    Iterable<Item> findAllByCollection(Collection col);
    Iterable<Item> findByTag(String tag);
    Iterable<Item> findAllByTagSetContains(Tag tag);
    Iterable<Item> findAllByTagContainsAndCollection(String tag, Collection collection);
    @Query(value="SELECT * FROM Item ORDER BY id DESC LIMIT 5", nativeQuery = true)
    List<Item> getLastFive();
    @Query(value = "SELECT * FROM Item where item.collection_id = ? ORDER BY item.name", nativeQuery = true)
    List<Item> getSortByName(Long collection_id);
    @Query(value = "SELECT * FROM Item where item.collection_id = ? ORDER BY item.name desc", nativeQuery = true)
    List<Item> getSortByNameDesc(Long collection_id);
    Item getItemById(Long id);
}
