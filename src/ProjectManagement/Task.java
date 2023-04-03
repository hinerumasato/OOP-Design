package ProjectManagement;

import java.util.List;

public class Task implements ProjectItem {
    private String name;
    private List<ProjectItem> projectItems;
    private Contact owner;
    private double timeRequired;

    public Task(String name, List<ProjectItem> projectItems, Contact owner, double timeRequired) {
        this.name = name;
        this.projectItems = projectItems;
        this.owner = owner;
        this.timeRequired = timeRequired;
    }

    public Task(String name, Contact owner, double timeRequired) {
        this.name = name;
        this.owner = owner;
        this.timeRequired = timeRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProjectItem> getProjectItems() {
        return projectItems;
    }

    public void setProjectItems(List<ProjectItem> projectItems) {
        this.projectItems = projectItems;
    }

    public Contact getOwner() {
        return owner;
    }

    public void setOwner(Contact owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Task: " + name;
    }

    @Override
    public double getTimeRequired() {
        return timeRequired;
    }

    public void setTimeRequired(double timeRequired) {
        this.timeRequired = timeRequired;
    }

}
