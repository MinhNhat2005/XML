package view;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentListToXML {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 3.8));
        students.add(new Student("Bob", 21, 3.5));
        students.add(new Student("Charlie", 19, 3.9));

        String xmlFilePath = "C:\\html\\bai tap"; // Thay đổi đường dẫn tới nơi bạn muốn lưu file XML

        try {
            FileWriter writer = new FileWriter(xmlFilePath);
            writer.write("<students>");
            for (Student student : students) {
                writer.write("<student>");
                writer.write("<name>" + student.getName() + "</name>");
                writer.write("<age>" + student.getAge() + "</age>");
                writer.write("<gpa>" + student.getGpa() + "</gpa>");
                writer.write("</student>");
            }
            writer.write("</students>");
            writer.close();
            System.out.println("File XML đã được tạo: " + xmlFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Student {
        private String name;
        private int age;
        private double gpa;

        public Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getGpa() {
            return gpa;
        }
    }
}
