package org.aminesidki.be04;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.aminesidki.be04.dto.MessageDto;
import org.aminesidki.be04.entity.Message;
import org.aminesidki.be04.mapper.MessageMapper;
import org.aminesidki.be04.repository.MessageRepository;
import org.aminesidki.be04.util.MessageDtoSamples;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository repository;
    private final MessageMapper mapper;

    public void save(@Valid MessageDto dto){
        Message toSave = mapper.toEntity(dto);
        mapper.toDto(repository.save(toSave));
    }

    public void saveAll(@Valid List<MessageDto> dto){
        List<Message> messages = dto.stream().map(mapper::toEntity).toList();
        repository.saveAll(messages);
    }

    public List<MessageDto> fetchAll(){
        return repository.getAllBy();
    }

    public void seed() {
        System.out.println("Starting seeding ---");
        saveAll(MessageDtoSamples.validSamples());
        System.out.println("Finished !       ---");
    }
}
