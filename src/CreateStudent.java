import java.io.FileWriter;
import java.io.IOException;

public class CreateStudent {
    public static void addStudent(Student s) {
        try {
            FileWriter fw=new FileWriter("students.txt",true);
            fw.write(s.toString()+"\n");
            fw.close();
            System.out.println("Student added successfully");
        }
        catch(IOException e) {
            System.out.println("Error writing file");
        }
    }
}