package org.aminesidki.be04.mapper;

import org.aminesidki.be04.dto.MessageDto;
import org.aminesidki.be04.entity.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageMapper {
    public Message toEntity(MessageDto dto){
        return new Message(dto.id(), dto.content());
    }

    public MessageDto toDto(Message entity) {
        return new MessageDto(entity.getId(), entity.getContent());
    }
}
