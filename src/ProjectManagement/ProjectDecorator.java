package ProjectManagement;

public abstract class ProjectDecorator implements ProjectItem {

    protected ProjectItem projectItem;

    public ProjectDecorator(ProjectItem projectItem) {
        this.projectItem = projectItem;
    }

    @Override
    public double getTimeRequired() {
        // TODO Auto-generated method stub
        return 0;
    }

    public ProjectItem getProjectItem() {
        return projectItem;
    }

    public void setProjectItem(ProjectItem projectItem) {
        this.projectItem = projectItem;
    }
}
