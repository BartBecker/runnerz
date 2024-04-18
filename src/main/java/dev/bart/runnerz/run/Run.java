package dev.bart.runnerz.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public record Run(Integer id,
                  @NotEmpty
                  String title,
                  LocalDateTime startedOn,
                  LocalDateTime completedOn,
                  @Positive
                  Integer km,
                  Location location) {

    public Run {
        if(!completedOn.isAfter(startedOn)) {
            try {
                throw new IllegalAccessException("Completed On must be after Started On");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
