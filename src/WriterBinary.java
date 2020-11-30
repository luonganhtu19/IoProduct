import java.io.*;
import java.util.List;
import java.util.Scanner;

public class WriterBinary {
    private static File fileSource=null;
    private static Scanner input= new Scanner(System.in);
    private static String path="Data/";
    private static String dataOutputStream="";

    public static void setPath(){
        System.out.println("Enter name file source");
        fileSource=new File(path+input.nextLine());
    }

    public static void writeFile(List<Object> listData) throws IOException {
        setPath();
        FileOutputStream fileOutputStream= new FileOutputStream(fileSource,true);
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(listData);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
