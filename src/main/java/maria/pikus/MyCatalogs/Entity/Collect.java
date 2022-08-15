package maria.pikus.MyCatalogs.Entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(schema = "public", name = "masha_collections")
public class Collect {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "increment")
    private Long id;

    private String name;
    private String description;
    private String topic;

    private byte condition1;
    private byte condition2;

}

