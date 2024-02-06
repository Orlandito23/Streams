package dev.danvega.streamsschedule.model;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

   public record LiveStream(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate){
}
