package ProjectManagement;

import java.io.File;

public class TestDrive {
    public static void main(String[] args) {
        System.out.println("Example for the Decorator pattern");
        System.out.println();
        System.out.println("Creating ProjectItems.");
        Contact contact1 = new ContactImpl("Simone", "Roberto",
                "Head Researcher and Chief Archivist", "Institute for Advanced (Java) Studies");
        Task task1 = new Task("Perform months of diligent research", contact1, 20.0);
        Task task2 = new Task("Obtain grant from World Java Foundation", contact1, 40.0);
        Deliverable deliverable1 = new Deliverable("Java History",
                "Comprehensive history of the design of all Java APIs", contact1);
        System.out.println("ProjectItem objects created. Results:");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(deliverable1);
        System.out.println();
        System.out.println("Creating decorators");
        ProjectDecorator decorator1 = new SupportedProjectItem(task1,
                new File("src/ProjectManagement/JavaHistory.txt"));
        ProjectDecorator decorator2 = new DependentProjectItem(decorator1, task2);
        System.out.println("Decorators added. Results");
        System.out.println(decorator2);
    }
}
