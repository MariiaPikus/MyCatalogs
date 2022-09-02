package maria.pikus.MyCatalogs.repository;

import maria.pikus.MyCatalogs.entity.Collection;
import maria.pikus.MyCatalogs.entity.Item;
import maria.pikus.MyCatalogs.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepo extends JpaRepository<Item, Long> {
    Iterable<Item> findAllByCollection(Collection col);

    Iterable<Item> findByTag(String tag);

    Iterable<Item> findAllByTagSetContains(Tag tag);

    Iterable<Item> findAllByTagContainsAndCollection(String tag, Collection collection);

    @Query(value = "SELECT * FROM Item ORDER BY id DESC LIMIT 5", nativeQuery = true)
    List<Item> getLastFive();

    @Query(value = "SELECT * FROM Item where item.collection_id = ? ORDER BY item.name", nativeQuery = true)
    List<Item> getSortByName(Long collection_id);

    @Query(value = "SELECT * FROM Item where item.collection_id = ? ORDER BY item.name desc", nativeQuery = true)
    List<Item> getSortByNameDesc(Long collection_id);

    Item getItemById(Long id);
}
