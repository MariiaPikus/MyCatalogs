package maria.pikus.MyCatalogs.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(schema = "public", name = "item1")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "nameErr")
    private String name;
    private String tag;
    @ManyToOne
    private Collection collection;


    public Item(String name, Collection collection) {
        this.name = name;
        this.tag = tag;
        this.collection = collection;

    }

    public Item() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

//    public Set<Tag> getTagSet() {
//        return tagSet;
//    }
//
//    public void setTagSet(Set<Tag> tagSet) {
//        this.tagSet = tagSet;
//    }
//
//    public Set<User> getLikes() {
//        return likes;
//    }
//
//    public void setLikes(Set<User> likes) {
//        this.likes = likes;
//    }
//
//    public Set<Comment> getComments() {
//        return comments;
//    }
//
//    public void setComments(Set<Comment> comments) {
//        this.comments = comments;
//    }
}
