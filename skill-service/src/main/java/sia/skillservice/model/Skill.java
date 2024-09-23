package sia.skillservice.model;

import jakarta.persistence.*;
import lombok.*;

@Builder(setterPrefix = "with")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "SKILLS")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "SKILL_NAME", nullable = false)
    private String skillName;

}
