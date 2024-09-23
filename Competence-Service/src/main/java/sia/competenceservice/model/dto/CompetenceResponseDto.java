package sia.competenceservice.model.dto;

import lombok.Builder;
import sia.languageservice.model.dto.LanguageResponseDto;
import sia.skillservice.model.dto.SkillResponseDto;

import java.io.Serializable;

@Builder(setterPrefix = "with")
public record CompetenceResponseDto (
        SkillResponseDto skill,
        LanguageResponseDto languages) implements Serializable {
}
