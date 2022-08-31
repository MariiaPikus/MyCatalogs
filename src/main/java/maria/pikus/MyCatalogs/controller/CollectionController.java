package maria.pikus.MyCatalogs.controller;


import maria.pikus.MyCatalogs.dto.response.CollectionToMainPageResponse;
import maria.pikus.MyCatalogs.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/collection")
public class CollectionController {

    @Autowired
    private CollectionService collectionService;


    @GetMapping("/get-top")
    public ResponseEntity<List<CollectionToMainPageResponse>> getTopCollections(){
     return collectionService.getTop5Collections();
    }


}
