package maria.pikus.MyCatalogs.controllers;

import maria.pikus.MyCatalogs.services.CollectionService;
import maria.pikus.MyCatalogs.services.ItemService;
import maria.pikus.MyCatalogs.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @Autowired
    private CollectionService collectionService;
    @Autowired
    private TagService tagService;
    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("maxSizeCollection", collectionService.getMaxSizeCollection());
        model.addAttribute("tags", tagService.getAllTags());
        model.addAttribute("lastAddedItems", itemService.getLastAddedItems());
        return "main";
    }

}
