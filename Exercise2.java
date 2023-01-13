import java.util.Scanner;



public class App {



    static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) throws Exception {

        drive("pass ");
        scan.close();

    }
    static void drive(String food) {

        System.out.println("Driving school");
        taste(food);

        String feedback = getFeedBack(food);



        // Define the base case / stopping condition

        if (feedback.equals("no")) {



            // Do something to reach the goal

            fixRecipe(food);



            // Recursive call

            drive(food);

        } else if (feedback.equals("yes")) {

            serve(food);

        }

    }



    static void taste(String food) {

        System.out.println("Driving a car");

    }

    static String getFeedBack(String pass) {

        System.out.println("Did you " + pass+ "the test ? (Enter \"yes\" or \"no\")");



        String feedback = scan.next();



        return feedback;

    }
    static void fixRecipe(String pass) {

        System.out.print("Retake the driving exam:");

        String ingredient = scan.next();

        System.out.println("Failed");

    }



    static void serve(String pass) {

        System.out.println("i passed the exam");
    }
}
