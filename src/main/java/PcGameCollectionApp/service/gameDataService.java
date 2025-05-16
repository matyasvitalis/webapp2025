package PcGameCollectionApp.service;

import PcGameCollectionApp.interfaces.gameDataRepository;
import PcGameCollectionApp.maindata.GameData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class gameDataService {

    @Autowired
    private gameDataRepository gameDataRepository;

    public List<GameData> getAllGames() {
        return gameDataRepository.findAll();
    }

    public GameData save(GameData game) {
        return gameDataRepository.save(game);
    }

    public GameData edit(GameData game) {
        return gameDataRepository.save(game);
    }

    public GameData findById(UUID id) {
        Optional<GameData> optionalGameData = gameDataRepository.findById(id);
        if (optionalGameData.isPresent()) {
            return optionalGameData.get();
        } else {
            throw new RuntimeException();
        }
    }
    public void deleteById(UUID id) {
        gameDataRepository.deleteById(id);
    }
}
