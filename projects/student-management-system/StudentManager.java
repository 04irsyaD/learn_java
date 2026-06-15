import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student searchStudentByNim(String nim) {
        for (Student student : students) {
            if (student.getNim().equals(nim)) {
                return student;
            }
        }
        return null;
    }

    public boolean updateStudent(String nim, String name, String major, double gpa) {
        Student student = searchStudentByNim(nim);
        if (student != null) {
            student.setName(name);
            student.setMajor(major);
            student.setGpa(gpa);
            return true;
        }
        return false;
    }

    public boolean deleteStudent(String nim) {
        Student student = searchStudentByNim(nim);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }
}
