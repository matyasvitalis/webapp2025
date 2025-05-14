package PcGameCollectionApp.service;

import PcGameCollectionApp.interfaces.GameDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameDataService {

    @Autowired
    private GameDataRepository gameDataRepository;
}
