package sia.skillservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sia.skillservice.mapper.SkillMapper;
import sia.skillservice.model.Skill;
import sia.skillservice.model.dto.SkillResponseDto;
import sia.skillservice.repository.SkillRepository;

@Service
@RequiredArgsConstructor
public class SkillService {

    private final SkillRepository skillRepository;
    private final SkillMapper skillMapper;

    public SkillResponseDto getSkill(Long id) throws NullPointerException {
        Skill skill = skillRepository.findById(id).orElse(null);
        SkillResponseDto responseDto = skillMapper.fromEntityToDto(skill);
        return responseDto;
    }

}
