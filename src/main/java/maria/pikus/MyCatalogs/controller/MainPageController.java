package maria.pikus.MyCatalogs.controller;


import maria.pikus.MyCatalogs.service.CollectionService;
import maria.pikus.MyCatalogs.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @Autowired
    private CollectionService collectionService;
    @Autowired
    private ItemService itemService;

    @GetMapping("/main")
    public String mainPage(Model model) {
        model.addAttribute("maxSizeCollection", collectionService.getMaxSizeCollection());
        model.addAttribute("lastAddedItems", itemService.getLastAddedItems());
        return "";
    }

}