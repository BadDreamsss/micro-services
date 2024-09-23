package sia.languageservice.model;

import jakarta.persistence.*;
import lombok.*;

@Builder(setterPrefix = "with")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "LANGUAGES", schema = "PUBLIC")
public class Languages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "LANGUAGE_NAME", nullable = false)
    private String languageName;

}

