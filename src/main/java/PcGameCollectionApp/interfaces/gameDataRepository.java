package PcGameCollectionApp.interfaces;

import PcGameCollectionApp.maindata.GameData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface gameDataRepository extends JpaRepository<GameData, UUID> {
    List<GameData> findByPublisherId(UUID publisherId);
}
