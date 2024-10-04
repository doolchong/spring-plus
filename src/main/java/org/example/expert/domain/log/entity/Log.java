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

    private String ip;

    private Log(String logMessage, String ip) {
        this.logMessage = logMessage;
        this.ip = ip;
    }

    public static Log from(String logMessage, String ip) {
        return new Log(logMessage, ip);
    }
}