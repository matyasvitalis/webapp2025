package PcGameCollectionApp.service;

import PcGameCollectionApp.interfaces.gameDataRepository;
import PcGameCollectionApp.interfaces.publisherRepository;
import PcGameCollectionApp.maindata.GameData;
import PcGameCollectionApp.maindata.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class publisherService {

    @Autowired
    private publisherRepository pubRepository;

    public List<Publisher> getAllPublisher() {
        return pubRepository.findAll();
    }

    public Publisher save(Publisher publisher) {
        return pubRepository.save(publisher);
    }

    public Publisher edit(Publisher publisher) {
        return pubRepository.save(publisher);
    }

    public Publisher findById(UUID id) {
        Optional<Publisher> optionalPublisher = pubRepository.findById(id);
        if (optionalPublisher.isPresent()) {
            return optionalPublisher.get();
        } else {
            throw new RuntimeException();
        }
    }
    public void deleteById(UUID id) {
        pubRepository.deleteById(id);
    }
}
