package sia.skillservice.model.dto;

import java.io.Serializable;

public record SkillResponseDto(
        String skillName
) implements Serializable {
}
