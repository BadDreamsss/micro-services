package sia.competenceservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sia.competenceservice.client.LanguageServiceClient;
import sia.competenceservice.model.dto.CompetenceResponseDto;

@Service
@RequiredArgsConstructor
public class CompetenceService {

    private final LanguageServiceClient serviceClient;

    public CompetenceResponseDto getCompetence(Long id) {
        CompetenceResponseDto responseDto = serviceClient.getCompetence(id);
        return responseDto;
    }

}
