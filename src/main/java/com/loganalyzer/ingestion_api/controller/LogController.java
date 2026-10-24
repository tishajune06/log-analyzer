
package com.loganalyzer.ingestion_api.controller;

import com.loganalyzer.ingestion_api.dto.LogRequest;
import com.loganalyzer.ingestion_api.dto.LogResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/logs")
public class LogController {

    @PostMapping
    public LogResponse ingestLog(@Valid @RequestBody LogRequest request) {
        return new LogResponse(
                "Log received successfully",
                request.service()
        );
    }
}

