package maria.pikus.MyCatalogs.services;

import maria.pikus.MyCatalogs.models.Collection;
import maria.pikus.MyCatalogs.models.Item;
import maria.pikus.MyCatalogs.models.User;
import maria.pikus.MyCatalogs.repos.CollectionsRepo;
import maria.pikus.MyCatalogs.repos.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionService {
    @Autowired
    private CollectionsRepo collectionsRepo;
    @Autowired
    private ItemRepo itemRepo;

    public Iterable<Item> getItems(Collection col) {
        return itemRepo.findAllByCollection(col);
    }

    public void editCollection(Collection collection, Collection newCollection) {
        collection.setName(newCollection.getName());
        collection.setDescription(newCollection.getDescription());
        collectionsRepo.save(collection);
    }

    public Iterable<Collection> getCollections(User user) {
        return collectionsRepo.findAllByOwner(user);
    }

    public void deleteCollection(Collection collection) {
        collectionsRepo.delete(collection);
    }

    public Iterable<Collection> getAllCollections() {
        return collectionsRepo.findAll();
    }

    public Collection getMaxSizeCollection() {
        Iterable<Collection> collections = getAllCollections();
        Collection maxSize = collections.iterator().next();
        for (Collection col : collections) {
            if (col.getItems().size() > maxSize.getItems().size())
                maxSize = col;
        }
        return maxSize;
    }

    public void saveCollection(Collection collection) {
        collectionsRepo.save(collection);
    }
}
