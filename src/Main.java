import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("1-> Add student");
            System.out.println("2-> View student");
            System.out.println("3-> Update student");
            System.out.println("4-> Delete student");
            System.out.println("5-> Exit");
            System.out.println("Enter your choice: ");
            int choice=Integer.parseInt(sc.nextLine().trim());
            switch(choice) {
                case 1:
                    System.out.println("ADD STUDENT PAGE");
                    System.out.println("Enter student id:");
                    int id=Integer.parseInt(sc.nextLine().trim());
                    System.out.println("Enter student Name:");
                    String name=sc.nextLine().trim();
                    System.out.println("Enter student Age:");
                    int age=Integer.parseInt(sc.nextLine().trim());
                    Student s=new Student(id,name,age);
                    CreateStudent.addStudent(s);
                    break;
                case 2:
                    System.out.println("Student details");
                    ReadStudent.viewStudents();
                    break;
                case 3:
                    System.out.println("Enter id to update:");
                    int uid = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter new name:");
                    String newName = sc.nextLine();

                    System.out.println("Enter new age:");
                    int newAge = Integer.parseInt(sc.nextLine());

                    updateStudent.updateStudent(uid, newName, newAge);
                    break;
                case 4:
                    System.out.println("Enter id to delete:");
                    int did = Integer.parseInt(sc.nextLine());
                    deleteStudent.dStudent(did);
                    break;
                case 5:
                    System.out.println("Thanks for using");
                    System.exit(0);
            }
        }

    }

}