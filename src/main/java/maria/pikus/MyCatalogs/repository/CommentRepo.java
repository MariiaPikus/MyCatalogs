package maria.pikus.MyCatalogs.repository;


import maria.pikus.MyCatalogs.entity.Comment;
import maria.pikus.MyCatalogs.entity.Item;
import maria.pikus.MyCatalogs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {

    Iterable<Comment> findAllByAuthor(User author);

    Iterable<Comment> findAllByItem(Item item);
}
