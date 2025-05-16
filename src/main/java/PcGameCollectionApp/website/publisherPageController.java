package PcGameCollectionApp.website;

import PcGameCollectionApp.maindata.GameData;
import PcGameCollectionApp.maindata.Publisher;
import PcGameCollectionApp.service.publisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/publisher_list")
public class publisherPageController {

    @Autowired
    private publisherService publisherService;

    @GetMapping("/lista")
    public String listPublishers(Model model)
    {
        List<Publisher> publishers = publisherService.getAllPublisher();
        model.addAttribute("publishers", publishers);
        return "publisher_list/publisher_list";
    }
    @GetMapping("/new")
    public String createNewPublisherPage(Model model)
    {
        model.addAttribute("publisher", new Publisher());
        return "publisher_list/create-publisherpage";
    }
    @PostMapping("/add")
    public String submitPublisherForm(@ModelAttribute Publisher publisher) {
        publisherService.save(publisher);
        return "redirect:/publisher_list/lista";
    }
    @GetMapping("/delete/{id}")
    public String deletePublisher(@PathVariable UUID id, RedirectAttributes redirectAttributes) {
        if (publisherService.hasGames(id)) {
            redirectAttributes.addFlashAttribute("error", "Ez a kiadó játékhoz van rendelve, ezért nem törölhető!");
            return "redirect:/publisher_list/lista";
        }
        publisherService.deleteById(id);
        return "redirect:/publisher_list/lista";

    }

}
