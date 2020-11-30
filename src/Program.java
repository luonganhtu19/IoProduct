import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        List<Object> objectList= new ArrayList<Object>();
        Product product1= new Product("tivi","10",100000);
        Product product2= new Product("car","E11110",200000);
        objectList.add(product1);
        objectList.add(product2);
//WriterBinary.writeFile(objectList);
//        WriterBinary.writeFile(product1);
//        WriterBinary.writeFile(product2);
        ReaderBinary.reader();
    }
}
