package PcGameCollectionApp.interfaces;

import PcGameCollectionApp.maindata.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublisherRepository extends JpaRepository<Publisher, UUID> {
}
