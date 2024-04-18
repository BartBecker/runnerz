package dev.bart.runnerz.run;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public record Run(Integer id,
                  String title,
                  LocalDateTime startedOn,
                  LocalDateTime completedOn,
                  Integer km,
                  Location location) {
}
