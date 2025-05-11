package PcGameCollectionApp.website;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gamelist")
public class GamePageController {

    @GetMapping("/lista")
    public String getGameList(Model model)
    {
        return "gamelist/gamelist";
    }

}
