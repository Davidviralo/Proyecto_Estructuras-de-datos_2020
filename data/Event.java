package data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
    private String name;
    private DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String id;
    private String description;
    private boolean isActive;
    private boolean isFinished;

    public Event() {
    }

    public Event(String name, String description) {
        this.name = name;
        this.description = description;
        isActive = false;
        isFinished = false;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isFinished() {
        return isFinished;
    }


    public String getName() {
        return name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    public DateTimeFormatter getTimeFormat() {
        return timeFormat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }
}
