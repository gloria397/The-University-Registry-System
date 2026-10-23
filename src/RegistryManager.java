import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Scanner;


public class RegistryManager {
    private List<Student> students = new ArrayList<>();

    public void loadStudents(String fileName) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");
                int id = Integer.parseInt(words[0].trim());
                String name = words[1].trim();
                double gpa = Double.parseDouble(words[2].trim());
                String major = words[3].trim();
                students.add(new Student(id, name, gpa, major));
            }
            System.out.println("student registered successfully");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void displayAllStudents () {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void groupStudentByMajor(){
        Map<String, List<Student>> groupedStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getmajor));

        groupedStudents.forEach((major, studentList) -> {
            System.out.println("\nMajor: " + major);

            studentList.forEach(student ->
                    System.out.println(student.getname()));
        });
    }
    public void addStudent(String fileName) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student GPA: ");
        double gpa = input.nextDouble();
        input.nextLine();

        System.out.print("Enter student major: ");
        String major = input.nextLine();

        File file = new File(fileName);

        System.out.println("File location: " + file.getAbsolutePath());

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(file, true))) {

            writer.write(id + "," + name + "," + gpa + "," + major);
            writer.newLine();

            System.out.println("Student saved to file successfully!");

            students.add(new Student(id, name, gpa, major));

        } catch (Exception e) {
            System.out.println("Error saving student:");
        }
    }
    }