package maria.pikus.MyCatalogs.services;

import maria.pikus.MyCatalogs.models.Tag;
import maria.pikus.MyCatalogs.repos.ItemRepo;
import maria.pikus.MyCatalogs.repos.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {
    @Autowired
    ItemRepo itemRepo;
    @Autowired
    TagRepo tagRepo;

    public Iterable<Tag> getAllTags() {
        return tagRepo.findAll();
    }
}
