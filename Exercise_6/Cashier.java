public class Cashier {
    
    public void checkout(GroceryItem item){
        System.out.println("You have bought a " + item.name);
    }
    public void showPrice(GroceryItem item){
        System.out.println("Price:" + item.price);

    }
}
