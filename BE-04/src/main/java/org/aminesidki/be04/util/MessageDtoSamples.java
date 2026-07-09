package org.aminesidki.be04.util;

import org.aminesidki.be04.dto.MessageDto;

import java.util.List;
import java.util.UUID;

public class MessageDtoSamples {

    public static List<MessageDto> validSamples() {
        return List.of(
                new MessageDto(null, "Hello, this is a first test message"),
                new MessageDto(null, "Short msg"),
                new MessageDto(null, "A".repeat(255)), // long content, tests column length / TEXT vs VARCHAR
                new MessageDto(null, "Unicode & emoji test: café, 日本語, 🚀🔥"),
                new MessageDto(null, "Line1\nLine2\nLine3"), // multiline content
                new MessageDto(null, "  leading/trailing spaces  "),
                new MessageDto(null, "SQL-ish content: '; DROP TABLE messages; --") // injection-safety sanity check
        );
    }
}