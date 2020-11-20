import java.util.*;

public class User {

    private int Id;
    private String firstName;
    private String eMail;
    private int zip;
    private String phone;
    private static int idUserIncrement=1;
    private ArrayList<Product> buyHistory;

    public User(String firstName, String eMail, int zip, String phone) {
        this.firstName = firstName;
        this.eMail = eMail;
        this.zip = zip;
        this.phone = phone;
        this.Id=idUserIncrement++;
        buyHistory=new ArrayList<>();
    }

    public void buyProductFromShop(Product product,Shop shop) {

        boolean found = false;

        for (int i = 0; i < shop.getProducts().size(); i++) {

            if (shop.getProducts().get(i).getProductName().equals(product.getProductName()) && shop.getProducts().get(i).getProductPrice() == product.getProductPrice()) {

                int stock_old = shop.getProducts().get(i).getStock();

                if (stock_old == 0) {

                    System.out.println("Product out of stock");
                }
                else {
                    stock_old = stock_old - 1;
                    shop.getProducts().get(i).setStock(stock_old);
                    shop.addUserToBuyHistory(this);
                    this.buyHistory.add(product);
                }


            }
        }
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
