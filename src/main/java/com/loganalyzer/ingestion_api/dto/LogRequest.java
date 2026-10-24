package com.loganalyzer.ingestion_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record LogRequest(
        @NotBlank String service,
        @NotBlank
        @Pattern(
                regexp = "INFO|WARN|ERROR",
                message = "level must be INFO, WARN, or ERROR"
        )
        String level,
        @NotBlank String message
) {
}
