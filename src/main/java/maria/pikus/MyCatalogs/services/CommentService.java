package maria.pikus.MyCatalogs.services;

import maria.pikus.MyCatalogs.models.Comment;
import maria.pikus.MyCatalogs.models.Item;
import maria.pikus.MyCatalogs.models.User;
import maria.pikus.MyCatalogs.repos.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentRepo commentRepo;

    public Iterable<Comment> getCommentsByItem(Item item) {
        return commentRepo.findAllByItem(item);
    }

    public void addComment(String comment, User author, Item item) {
        Comment comm = new Comment(comment, author, item);
        commentRepo.save(comm);
    }
}
