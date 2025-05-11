package PcGameCollectionApp.maindata;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class GameTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String gameTitle;

}
