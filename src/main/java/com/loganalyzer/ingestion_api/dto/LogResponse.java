
package com.loganalyzer.ingestion_api.dto;

public record LogResponse(
        String message,
        String service
) {
}
