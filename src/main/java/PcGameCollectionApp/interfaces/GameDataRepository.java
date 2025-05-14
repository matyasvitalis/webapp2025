package PcGameCollectionApp.interfaces;

import PcGameCollectionApp.maindata.GameData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GameDataRepository extends JpaRepository<GameData, UUID> {
}
