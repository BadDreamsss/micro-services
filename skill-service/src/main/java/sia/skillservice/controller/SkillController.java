package sia.skillservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import sia.skillservice.model.dto.SkillResponseDto;
import sia.skillservice.service.SkillService;

@RestController
@RequestMapping("/skill")
@RequiredArgsConstructor
public class SkillController {

    private final SkillService skillService;

    @GetMapping("/{id}")
    public ResponseEntity<SkillResponseDto> getSkill(@PathVariable(name = "id") Long id) {
        SkillResponseDto responseDto = skillService.getSkill(id);
        if(responseDto == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(responseDto);
    }
}
