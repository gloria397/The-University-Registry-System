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
    public void setId(int Id) {
        this.Id = Id;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public void setgpa(double gpa) {
        this.gpa = gpa;
    }
    public void setmajor(String Major) {
        major = Major;
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