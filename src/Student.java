public class Student {
    private int Id;
    private String Name;
    private double gpa;
    private String major;
    public Student(int Id, String name, double gpa, String major) {
        this.Id = Id;
        this.Name = name;
        this.gpa = gpa;
        this.major = major;
    }
    public int getId() {
        return Id;
    }
    public String getname() {
        return Name;

    }
    public double getgpa() {
        return gpa;
    }
    public String getmajor() {
        return major;
    }
    @Override
    public String toString() {
        return "student{"+
                "id="+Id +"/"+
                "name="+Name +"/"+
                "gpa="+gpa+"/"+
                "major="+major+ "/"+
                "}";
    }
}