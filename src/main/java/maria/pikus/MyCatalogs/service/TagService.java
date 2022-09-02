package maria.pikus.MyCatalogs.service;

import maria.pikus.MyCatalogs.entity.Tag;
import maria.pikus.MyCatalogs.repository.ItemRepo;
import maria.pikus.MyCatalogs.repository.TagRepo;
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
