package PcGameCollectionApp.website;

import PcGameCollectionApp.maindata.GameData;
import PcGameCollectionApp.service.gameDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/gamelist")
public class GamePageController {

    @Autowired
    private gameDataService gameDataService;

    @GetMapping("/lista")
    public String listGames(Model model)
    {
        List<GameData> games = gameDataService.getAllGames();
        model.addAttribute("games", games);
        return "gamelist/gamelist";
    }

}
