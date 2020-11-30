import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nameProduct = null;
    private String idProduct =null;
    private String manufacturer=null;
    private double priceProduct=0;
    private String description=null;

    Product(String nameProduct,String idProduct, double priceProduct){
        this.nameProduct=nameProduct;
        this.idProduct=idProduct;
        this.priceProduct=priceProduct;
    }
    Product(String nameProduct, String idProduct, String manufacturer,double priceProduct, String description){
        this.nameProduct=nameProduct;
        this.idProduct=idProduct;
        this.manufacturer=manufacturer;
        this.priceProduct=priceProduct;
        this.description=description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", idProduct='" + idProduct + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", priceProduct=" + priceProduct +
                ", description='" + description + '\'' +
                '}';
    }
}
