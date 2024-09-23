package sia.skillservice.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import sia.skillservice.model.Skill;
import sia.skillservice.model.dto.SkillResponseDto;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface SkillMapper {

    SkillResponseDto fromEntityToDto(Skill skill);

}
