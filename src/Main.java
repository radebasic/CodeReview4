public class Main {

    public static void main(String[] args) {
        Product p1=new Product("Nike tshirt","L size tshirt",33.4,ProductCategory.Tshirts);
        Product p2=new Product("Addidas tshirt","L size tshirt",20.4,ProductCategory.Tshirts);

        Shop zara=new Shop("Zara", "Mariahilferstrasse");
        zara.addProductToShop(p1);
        zara.addProductToShop(p2);
        zara.addProductToShop(p1);

        User Rade=new User("Rade", "rade@gmail.com",8402,"065-899-877");

        Rade.buyProductFromShop(p1,zara);
        Rade.buyProductFromShop(p1,zara);

        zara.menuShop();




    }
}
