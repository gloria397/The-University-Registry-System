import java.io.File;

public class Main {
    public static void main(String[] args) {
        RegistryManager registryManager = new RegistryManager();

        File file = new File("src/Data.txt");
        if (file.exists()) {

            registryManager.loadStudents(file.getAbsolutePath());

            System.out .println("DISPLAYING ALL STUDENTS:");
            registryManager.displayAllStudents();

            System.out.println("STUDENTS GROUPED BY MAJOR:");
            registryManager.groupStudentByMajor();
        }
        else{
            System.out.println("No such file or directory");
        }

    }
}