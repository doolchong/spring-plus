package org.example.expert.domain.log.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "logs")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logMessage;

    private final LocalDateTime createdAt = LocalDateTime.now();

    private Log(String logMessage) {
        this.logMessage = logMessage;
    }

    public static Log from(String logMessage) {
        return new Log(logMessage);
    }
}