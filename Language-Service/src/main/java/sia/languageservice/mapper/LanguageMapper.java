package sia.languageservice.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import sia.languageservice.model.Languages;
import sia.languageservice.model.dto.LanguageResponseDto;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface LanguageMapper {

    LanguageResponseDto fromEntityToDto(Languages languages);

}
