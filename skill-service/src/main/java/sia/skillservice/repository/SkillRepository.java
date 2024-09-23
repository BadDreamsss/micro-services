package sia.skillservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sia.skillservice.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}
