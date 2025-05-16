package PcGameCollectionApp.website;

import PcGameCollectionApp.maindata.GameData;
import PcGameCollectionApp.service.gameDataService;
import PcGameCollectionApp.service.publisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/gamelist")
public class GamePageController {

    @Autowired
    private gameDataService gameDataService;
    @Autowired
    private publisherService publisherService;

    @GetMapping("/lista")
    public String listGames(Model model)
    {
        List<GameData> games = gameDataService.getAllGames();
        model.addAttribute("games", games);
        return "gamelist/gamelist";
    }

    @GetMapping("/new")
    public String createNewGamePage(Model model)
    {
    model.addAttribute("gameData", new GameData());
    model.addAttribute("publishers", publisherService.getAllPublisher());
    return "gamelist/create-gamepage";
    }

    @PostMapping("/add")
    public String submitGameForm(@ModelAttribute GameData gameData) {
        gameDataService.save(gameData);
        return "redirect:/gamelist/lista";
    }

    @GetMapping("/delete/{id}")
    public String deleteGame(@PathVariable UUID id) {
        gameDataService.deleteById(id);
        return "redirect:/gamelist/lista";
    }

    // datum konvertalashoz
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
