public class Student {
    private String id;
    private String name;
    private String subject;
    private String marks;

    public Student() {
    }

    public Student(String name,String marks) {
        this.name =name;
        this.marks = marks;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getMarks() {
        return marks;
    }
}