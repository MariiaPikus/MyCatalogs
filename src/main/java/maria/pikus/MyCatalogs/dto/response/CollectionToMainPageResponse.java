package maria.pikus.MyCatalogs.dto.response;

import lombok.Data;

@Data
public class CollectionToMainPageResponse {
    private Long id;
    private String author;
    private String topic;
    private String name;
//    private String imageAddress;
}