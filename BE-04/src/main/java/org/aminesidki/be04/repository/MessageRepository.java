package org.aminesidki.be04.repository;

import org.aminesidki.be04.dto.MessageDto;
import org.aminesidki.be04.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * Example JPA repository for operations on data
 */
@Repository
public interface MessageRepository extends JpaRepository<Message, UUID> {
    List<MessageDto> getAllBy();
}
