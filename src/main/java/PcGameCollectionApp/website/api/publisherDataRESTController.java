package PcGameCollectionApp.website.api;

import PcGameCollectionApp.maindata.GameData;
import PcGameCollectionApp.maindata.Publisher;
import PcGameCollectionApp.service.gameDataService;
import PcGameCollectionApp.service.publisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("api/publishers")
public class publisherDataRESTController {

    @Autowired
    private publisherService publisherService;

    @GetMapping
    public List<Publisher> getAllPublishers(){
        return publisherService.getAllPublisher();
    }
    @GetMapping("/{id}")
    public Publisher getPublishersById(@PathVariable UUID id) {
        return publisherService.findById(id);
    }

    @PostMapping("/create")
    public Publisher createPublisher(@RequestBody Publisher publisher) {
        return publisherService.save(publisher);
    }

    @PostMapping("/update")
    public Publisher updatePublisher(@RequestBody Publisher publisher) {
        return publisherService.edit(publisher);
    }

    @DeleteMapping("/{id}")
    public void deletePublisherById(@PathVariable UUID id) {
        publisherService.deleteById(id);
    }
}
