package maria.pikus.MyCatalogs.Controller;

import maria.pikus.MyCatalogs.Entity.Collect;
import maria.pikus.MyCatalogs.Repository.CollectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CollectController {

    List<Collect> collectList = new ArrayList<>();
    @Autowired
    private CollectRepo repo;

    @RequestMapping("/collects")
    public List<Collect> getCollect() {
        collectList = repo.findAll();
        return collectList;
    }
}