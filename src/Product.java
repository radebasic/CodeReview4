
/* Create a class Product with properties:
    productId
    productName
    productDescription
    productPrice
    productCategory (enum class suggested here).
    A product can only have a max. stock of 15 items.
    Think about categories like: T-Shirts, Trousers, Shirts, Jackets, Accessoire etc.
*/

public class Product {

private int productId;
private String productName;
private String productDescription;
private double productPrice;
private ProductCategory productCategory;
private static int IdIncrement=1;
private int stock;

    public Product(String productName, String productDescription, double productPrice, ProductCategory productCategory) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productId=IdIncrement++;
        this.stock=1;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                ", productCategory=" + productCategory +
                ", stock=" + stock +
                '}';
    }
}
