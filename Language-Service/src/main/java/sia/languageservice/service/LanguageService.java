package sia.languageservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sia.languageservice.mapper.LanguageMapper;
import sia.languageservice.model.Languages;
import sia.languageservice.model.dto.LanguageResponseDto;
import sia.languageservice.repository.LanguagesRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LanguageService {

    private final LanguagesRepository languageRepository;
    private final LanguageMapper languageMapper;

    public LanguageResponseDto getLanguage(Long id){
        Languages languages = languageRepository.findById(id).orElse(null);
//        System.out.println(languages);
        return languageMapper.fromEntityToDto(languages);
    }
}
