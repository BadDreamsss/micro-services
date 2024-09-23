package sia.competenceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sia.competenceservice.model.dto.CompetenceResponseDto;
import sia.competenceservice.service.CompetenceService;

@RestController
@RequestMapping("/competence")
public class CompetenceApiController {

    @Autowired
    private CompetenceService service;

    @GetMapping("/{id}")
    public ResponseEntity<CompetenceResponseDto> getCompetence(@PathVariable Long id) {
        return ResponseEntity.ok(service.getCompetence(id));
    }

}
