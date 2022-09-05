package maria.pikus.MyCatalogs.repos;

import maria.pikus.MyCatalogs.models.Comment;
import maria.pikus.MyCatalogs.models.Item;
import maria.pikus.MyCatalogs.models.User;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepo extends CrudRepository<Comment, Long> {

    Iterable<Comment> findAllByAuthor(User author);
    Iterable<Comment> findAllByItem(Item item);
}
