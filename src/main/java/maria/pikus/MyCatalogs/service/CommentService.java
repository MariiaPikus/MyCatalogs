package maria.pikus.MyCatalogs.service;

import maria.pikus.MyCatalogs.entity.Comment;
import maria.pikus.MyCatalogs.entity.Item;
import maria.pikus.MyCatalogs.entity.User;
import maria.pikus.MyCatalogs.repository.CommentRepo;
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
