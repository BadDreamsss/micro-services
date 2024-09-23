package sia.languageservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import sia.languageservice.model.dto.LanguageResponseDto;
import sia.languageservice.service.LanguageService;

import java.util.List;

@RestController
@RequestMapping("/language")
@RequiredArgsConstructor
public class LanguageController {

    private final LanguageService languageService;

    @GetMapping("/{id}")
    public ResponseEntity<LanguageResponseDto> getLanguages(@PathVariable(name = "id") Long id) {
        LanguageResponseDto languageResponseDto = languageService.getLanguage(id);
        if(languageResponseDto == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(languageResponseDto);
    }

}
