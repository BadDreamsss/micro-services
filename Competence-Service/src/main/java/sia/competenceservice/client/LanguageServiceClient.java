package sia.competenceservice.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import sia.competenceservice.model.dto.CompetenceResponseDto;
import sia.languageservice.model.dto.LanguageResponseDto;
import sia.skillservice.model.dto.SkillResponseDto;

@Component
public class LanguageServiceClient {

    @Autowired
    private RestTemplate restTemplate;

    public CompetenceResponseDto getCompetence(Long id) {
        return  CompetenceResponseDto.builder()
                .withLanguages(restTemplate.getForObject("http://LANGUAGE-SERVICE/language/" + id, LanguageResponseDto.class))
                .withSkill(restTemplate.getForObject("https://SKILL-SERVICE/skill/" + id, SkillResponseDto.class))
                .build();
    }

}
