package ProjectManagement;

public class DependentProjectItem extends ProjectDecorator {
    private ProjectItem dependentItem;

    public DependentProjectItem(ProjectItem projectItem) {
        super(projectItem);
    }

    public DependentProjectItem(ProjectItem projectItem, ProjectItem newDependentItem) {
        super(projectItem);
        this.dependentItem = newDependentItem;
    }

    public ProjectItem getDependentItem() {
        return dependentItem;
    }

    public void setDependentItem(ProjectItem dependentItem) {
        this.dependentItem = dependentItem;
    }

    public String toString() {
        return getProjectItem().toString() + EOL_STRING
                + "\tProjectItem dependent on: " + dependentItem;
    }

}
