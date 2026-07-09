package org.aminesidki.be04.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.UUID;

public record MessageDto(UUID id,
                         @NotNull(message = "Message content must not be null !")
                         @NotBlank(message = "Message content must not be blank !")
                         String content) implements Serializable {}
