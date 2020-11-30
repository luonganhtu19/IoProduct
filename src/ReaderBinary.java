import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderBinary  {
    private static File fileSource= null;
    private static Scanner input=new Scanner(System.in);
    private static String path="Data/";
    public static boolean  pathFile() throws IOException{
        System.out.println("Enter name file source: ");
        String nameFile=input.nextLine();
        fileSource= new  File(path+nameFile);
        if (!fileSource.exists()){
            System.out.println(" No exist file");
            return false;
        }
        return true;
    }
    public static void reader() throws IOException,ClassNotFoundException {
        boolean checkExist=pathFile();
        if (!checkExist) return;
        FileInputStream fileInputStream= new FileInputStream(fileSource);
        ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
        List<Object> objectList=(List<Object>) objectInputStream.readObject();
        for (Object product : objectList){
            System.out.println(product);
        }
//        Object[] list=(Object[]) objectInputStream.readObject();
//        System.out.println(objectInputStream.readObject());
//        System.out.println(objectInputStream.readObject());
    }
}
