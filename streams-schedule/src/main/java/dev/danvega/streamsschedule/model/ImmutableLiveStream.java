package dev.danvega.streamsschedule.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class ImmutableLiveStream {

    private final String id;
    private final String title;
    private final String descripcion;
    private final String url;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;

    public ImmutableLiveStream(String id, String title, String descripcion, String url, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.title = title;
        this.descripcion = descripcion;
        this.url = url;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableLiveStream that = (ImmutableLiveStream) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(descripcion, that.descripcion) && Objects.equals(url, that.url) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, descripcion, url, startDate, endDate);
    }

    @Override
    public String toString() {
        return "ImmutableLiveStream{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", url='" + url + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
