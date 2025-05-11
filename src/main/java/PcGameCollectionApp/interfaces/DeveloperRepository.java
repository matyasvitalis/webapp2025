package PcGameCollectionApp.interfaces;

import PcGameCollectionApp.maindata.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeveloperRepository extends JpaRepository<Developer, UUID> {
}
