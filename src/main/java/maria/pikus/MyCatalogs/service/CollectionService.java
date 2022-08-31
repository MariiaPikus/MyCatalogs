package maria.pikus.MyCatalogs.service;


import lombok.RequiredArgsConstructor;
import maria.pikus.MyCatalogs.dto.response.CollectionToMainPageResponse;
import maria.pikus.MyCatalogs.entity.Collection;
import maria.pikus.MyCatalogs.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CollectionService {

    @Autowired
    CollectionRepository collectionRepository;

    public ResponseEntity<List<CollectionToMainPageResponse>> getTop5Collections(){
        List<CollectionToMainPageResponse> collectionToMainPageResponses =
                setCollectionsResponse(collectionRepository.getTopCollections(PageRequest.of(0,5)));
        return ResponseEntity.ok().body(collectionToMainPageResponses);
    }

    public List<CollectionToMainPageResponse> setCollectionsResponse(List<Collection> collections){
        List<CollectionToMainPageResponse> collectionToMainPageRespons = new ArrayList<>();

        collections.forEach(collection -> {

            CollectionToMainPageResponse cResponse = new CollectionToMainPageResponse();

            cResponse.setId(collection.getId());

            cResponse.setName(collection.getName());

//            cResponse.setTopic(topicService.getTopicNameById(collection.getTopicId()));
//
//            cResponse.setAuthor(userService.getUsernameById(collection.getUserId()));

//            cResponse.setImageAddress(collection.getImageAddress());

            collectionToMainPageRespons.add(cResponse);
        });
        return collectionToMainPageRespons;
    }




}

