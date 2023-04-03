package ProjectManagement;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SupportedProjectItem extends ProjectDecorator {
    private List<File> supportingDocuments = new ArrayList<File>();

    public SupportedProjectItem(ProjectItem projectItem) {
        super(projectItem);
    }

    public SupportedProjectItem(ProjectItem projectItem, File supportedProjectItem) {
        super(projectItem);
        addSupportingDocuments(supportedProjectItem);
    }

    public List<File> getSupportingDocuments() {
        return supportingDocuments;
    }

    public void addSupportingDocuments(File document) {
        if (!supportingDocuments.contains(document))
            supportingDocuments.add(document);
    }

    public void removeSupportingDocuments(File document) {
        if (supportingDocuments.contains(document))
            supportingDocuments.remove(document);
    }

    public String toString() {
        return getProjectItem().toString() + EOL_STRING
                + "\tSupporting Documents: " + supportingDocuments;
    }
}
