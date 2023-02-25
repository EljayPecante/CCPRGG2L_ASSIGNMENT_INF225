public class App {
    public static void main(String[] args) throws Exception {

        Person friend = new Person("White", 5);
        
        Myself me = new Myself("Lord",21);
        me.addFriend(friend);

        Pet dog = new Pet("kitten ", friend);
        dog.showOwnerName();

        Car car = new Car("BMW ", me);
        car.showCar();
    }
}
