package PcGameCollectionApp.service;

import PcGameCollectionApp.interfaces.gameDataRepository;
import PcGameCollectionApp.maindata.GameData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gameDataService {

    @Autowired
    private gameDataRepository gameDataRepository;

    public List<GameData> getAllGames()
    {
        return gameDataRepository.findAll();
    }
}
