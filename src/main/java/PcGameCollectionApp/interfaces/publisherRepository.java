package PcGameCollectionApp.interfaces;

import PcGameCollectionApp.maindata.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface publisherRepository extends JpaRepository<Publisher, UUID> {

}
