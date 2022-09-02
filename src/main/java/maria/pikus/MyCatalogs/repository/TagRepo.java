package maria.pikus.MyCatalogs.repository;


import maria.pikus.MyCatalogs.entity.Item;
import maria.pikus.MyCatalogs.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepo extends JpaRepository<Tag, Long> {
    List<Tag> findAllByTagName(String tagName);

    Tag findByTagName(String tagName);

    List<Tag> findAllByItemsContains(Item item);
}
