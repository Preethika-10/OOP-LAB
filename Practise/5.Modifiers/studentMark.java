class Student {
    private String aadhaarNumber;       // sensitive
    protected int internalMarks;        // accessible in class & subclasses
    public String name;
    public int rollNumber;

    public static final String SCHOOL_MOTTO = "Knowledge is Power";
    public static int totalStudents = 0;

    public Student(String name, int rollNumber, String aadhaarNumber, int marks) {
        this.name = name;
this.rollNumber = rollNumber;
this.aadhaarNumber = aadhaarNumber;
this.internalMarks = marks;
totalStudents++;
    }

    public void displayStudentInfo() {
System.out.println("Name: " + name);
System.out.println("Roll Number: " + rollNumber);
System.out.println("Internal Marks: " + internalMarks);
    }
}

public class studentMark {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "1234-5678-9012", 85);
        Student s2 = new Student("Bob", 102, "2345-6789-0123", 90);
        Student s3 = new Student("Charlie", 103, "3456-7890-1234", 78);

        s1.displayStudentInfo();
System.out.println("School Motto: " + Student.SCHOOL_MOTTO);
System.out.println("-------------------");
        s2.displayStudentInfo();
System.out.println("-------------------");
        s3.displayStudentInfo();
System.out.println("Total Students: " + Student.totalStudents);
    }
}
