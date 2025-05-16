package PcGameCollectionApp.website;

import PcGameCollectionApp.maindata.GameData;
import PcGameCollectionApp.maindata.Publisher;
import PcGameCollectionApp.service.publisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/publisher_list")
public class publisherPageController {

    @Autowired
    private publisherService publisherService;

    @GetMapping("/lista")
    public String listPublishers(Model model)
    {
        List<Publisher> publishers = publisherService.getAllPublisher();
        model.addAttribute("publisher", publishers);
        return "publisher_list/publisher_list";
    }
}
