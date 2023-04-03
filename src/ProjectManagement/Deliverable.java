package ProjectManagement;

public class Deliverable implements ProjectItem {
    private String name;
    private String description;
    private Contact owner;

    public Deliverable(String name, String description, Contact owner) {
        this.name = name;
        this.description = description;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Contact getOwner() {
        return owner;
    }

    public void setOwner(Contact owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Deliverable: " + name;
    }

    @Override
    public double getTimeRequired() {
        return 0;
    }

}
