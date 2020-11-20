import java.util.*;

public class Shop {

    private String name;
    private String address;
    private ArrayList<Product> products;
    private ArrayList<User> users;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
        products=new ArrayList<>(); //empty array list
        this.users=new ArrayList<>();
    }

    public void addUserToBuyHistory(User user){
        users.add(user);
    }

    public void addProductToShop(Product product){

        boolean found=false;

        for(int i=0; i<products.size(); i++){

            if (products.get(i).getProductName().equals(product.getProductName()) && products.get(i).getProductPrice()==product.getProductPrice()){

                if(products.get(i).getStock()>=15){
                    System.out.println("Product has more then 15 items in stock");
                    found = true;
                }else {
                    int newStock = products.get(i).getStock() + 1;
                    products.get(i).setStock(newStock);
                    found = true;
                }
            }
        }

        if(found==false) {
            products.add(product);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }


    public void menuShop(){
        int choise=0;
        while(choise!=5)

            try {

                System.out.println("+----------------------+");
                System.out.println("\t\tWelcome\n\t\tto the \n\t\tshop");
                System.out.println("+----------------------+");
                System.out.println("Make a selection");
                System.out.println("1. Display all products");
                System.out.println("2. Display all products of category x");
                System.out.println("3. Display all products where stock <5 ");
                System.out.println("4. Display all products out of stock");
                System.out.println("5. Exit");
                System.out.println("Enter your choise:");
                Scanner sca = new Scanner(System.in);
                choise = sca.nextInt();

                switch (choise) {

                    case 1:
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println(products.get(i));
                        }
                        break;

                    case 2:
                        int category = 0;
                        ProductCategory catt = null;
                        System.out.println("Choose category");
                        System.out.println("1. Tshirt");
                        System.out.println("2. Trausers");
                        System.out.println("3. Jackets");
                        Scanner sc = new Scanner(System.in);
                        category = sc.nextInt();

                        if (category == 1) catt = ProductCategory.Tshirts;
                        if (category == 2) catt = ProductCategory.Trausers;
                        if (category == 3) catt = ProductCategory.Jackets;

                        for (int i = 0; i < products.size(); i++) {
                            if (products.get(i).getProductCategory() == catt)
                                System.out.println(products.get(i));
                        }

                        break;

                    case 3:
                        for (int i = 0; i < products.size(); i++) {
                            if (products.get(i).getStock() < 5)
                                System.out.println(products.get(i));
                        }
                        break;
                    case 4:
                        for (int i = 0; i < products.size(); i++) {
                            if (products.get(i).getStock() == 0)
                                System.out.println(products.get(i));
                        }
                        break;

                    case 5:
                        choise = 5;
                        break;

                    default:
                        System.out.println("You must type number from 1 to 5");

                }

            }catch (Exception ex){

                System.out.println("You must type number");
            }




    }
}
