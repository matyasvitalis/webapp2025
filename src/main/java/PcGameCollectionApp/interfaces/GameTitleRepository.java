package PcGameCollectionApp.interfaces;

import PcGameCollectionApp.maindata.GameTitle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GameTitleRepository extends JpaRepository<GameTitle, UUID> {
}
