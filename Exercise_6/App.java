public class App {
    
    public static void main(String[] args) throws Exception {
       
        GroceryItem item1 = new GroceryItem();
        System.out.println("========================");
        item1.name = "receipt";

        item1.showItemName();

        GroceryItem item2 = new Toothbrush();
        item2.name = "colgate";
        item2.price = 15;
        item2.showItemName();
        
        System.out.println("=========================");

        GroceryItem item3 = new Toothpaste();
        item3.name = "pepsodent";
        item3.price = 16;
        item3.showItemName();
       
        System.out.println("=========================");

        // Cashier object
        Cashier c1 = new Cashier();
         // Polymorphic parameter
        c1.checkout(item2);
        c1.showPrice(item2);
        c1.checkout(item3);
        c1.showPrice(item3);

        System.out.println("=========================");

        // Polymorphic Array

        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item2;
        itemArray[1] = item3;

        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
        }

        Dog myDog = new Dog();
        myDog.eat();

        Lion myLion = new Lion();
        myLion.walk();
        myLion.run();

    }
}
