package PcGameCollectionApp.maindata;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class GameData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String gameTitle;
    private String developer;
    @Column (name = "releaseDate")
    private Date releaseDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id", nullable = false)
    private Publisher publisher;


}
