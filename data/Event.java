package data;

public class Event {
    private String name;
    private String startDate;
    private String endDate;
    private String id;
    private String description;
    protected boolean isActive;
    protected boolean isFinished;

    public Event(String name, String id, String startDate, String description) {
        this.name = name;
        this.id = id;
        this.startDate = startDate;
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

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
