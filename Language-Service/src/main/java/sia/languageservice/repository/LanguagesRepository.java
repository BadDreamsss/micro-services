package sia.languageservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sia.languageservice.model.Languages;


public interface LanguagesRepository extends JpaRepository<Languages, Long> {

}
