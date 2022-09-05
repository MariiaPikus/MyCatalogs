package maria.pikus.MyCatalogs.controllers;

import maria.pikus.MyCatalogs.models.Item;
import maria.pikus.MyCatalogs.models.User;
import maria.pikus.MyCatalogs.services.CommentService;
import maria.pikus.MyCatalogs.services.ItemService;
import maria.pikus.MyCatalogs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class CommentsController {
    @Autowired
    private CommentService commentService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private UserService userService;

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public Map<String, String> sendComment(@Payload Map<String, String> comment) {
        Item item = itemService.getItemById(Long.parseLong(comment.get("item")));
        User user = userService.getUserByName(comment.get("author"));
        commentService.addComment(comment.get("comment"), user, item);
        return comment;
    }
}
