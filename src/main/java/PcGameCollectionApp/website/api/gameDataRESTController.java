package PcGameCollectionApp.website.api;

import PcGameCollectionApp.maindata.GameData;
import PcGameCollectionApp.service.gameDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("api/games")
public class gameDataRESTController {

@Autowired
    private gameDataService gamedataService;

@GetMapping
    public List<GameData> getAllGames(){
    return gamedataService.getAllGames();
}
    @GetMapping("/{id}")
    public GameData getGamesById(@PathVariable UUID id) {
        return gamedataService.findById(id);
    }

    @PostMapping("/create")
    public GameData createGame(@RequestBody GameData game) {
        return gamedataService.save(game);
    }

    @PostMapping("/update")
    public GameData updateGame(@RequestBody GameData game) {
        return gamedataService.edit(game);
    }

    @DeleteMapping("/{id}")
    public void deleteGameById(@PathVariable UUID id) {
        gamedataService.deleteById(id);
    }

}
