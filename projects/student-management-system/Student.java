public class Student {
    private String nim;
    private String name;
    private String major;
    private double gpa;

    public Student(String nim, String name, String major, double gpa) {
        this.nim = nim;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + " | Nama: " + name + " | Jurusan: " + major + " | IPK: " + gpa;
    }
}
