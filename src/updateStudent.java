import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class updateStudent {
    public static void updateStudent(int id,String newName,int newAge) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("students.txt"));
            FileWriter fw=new FileWriter("temp.txt");
            String line;
            while((line=br.readLine())!=null) {
                //System.out.println(line);
                String[] arr=line.split(",");
                System.out.println(arr[0]);
                if(Integer.parseInt(arr[0]) ==id) {
                    fw.write(id+","+newName+","+newAge+"\n");
                }
                else {
                    fw.write(line+"\n");
                }
            }
            br.close();
            fw.close();
            FileWriter fw1=new FileWriter("students.txt");
            fw1.close();
            BufferedReader br2=new BufferedReader(new FileReader("temp.txt"));
            FileWriter fw2=new FileWriter("students.txt",true);
            String line2;
            while((line2=br2.readLine())!=null) {
                fw2.write(line2+"\n");
            }
            br2.close();
            fw2.close();

        }
        catch(IOException e) {
            System.out.println("error updating the file");
        }


    }
}
