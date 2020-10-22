import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {
        System.out.println("The car is a Mitsubishi Space Star");
        testSuite();
    }

    private static void testSuite() {
        System.out.println(" ");
        System.out.println("the Testsuite is running...");
        System.out.println("Which test do you wanna run? ");
        System.out.println("[1] Test 1 (The car is turned on)");
        System.out.println("[2] Test 2 (The car cannot turn on)");
        System.out.println("[3] Test 3 (Does the lights work?)");
        System.out.println("[4] Test 4 (Can the car drive?)");
        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();

        if (answer == 1) {
            //Test 1 (bilen skal være tændt)
            testStartCarWithCorrectKey();
        }
        if (answer == 2) {
            //Test 2 (bilen skal ikke være tændt)
            testStartCarWithWrongKey();
        }
        if (answer == 3) {
            //Test 3 (Kan bilen kører?)
            testLights();
        }
        if (answer == 4) {
            testIfItCanDrive();
        }
    }

    private static void testStartCarWithCorrectKey() {
        Car DelalCar = new Car();
        CarKey key = new CarKey("password1234");

        DelalCar.turnEngineOn(key);
    }

    private static void testStartCarWithWrongKey() {
        Car DelalCar = new Car();
        CarKey key = new CarKey("hej");

        DelalCar.turnEngineOn(key);
    }

    private static void testLights() {
        Car DelalCar = new Car();
        CarKey key = new CarKey("password1234");
        DelalCar.turnEngineOn(key);

        DelalCar.Lights();
    }

    private static void testIfItCanDrive() {
        Car DelalCar = new Car();
        CarKey key = new CarKey("password1234");
        DelalCar.turnEngineOn(key);

        //Check håndbremsen
        DelalCar.Handbrake(true); //Hvis false, så vil den stoppe her.

        DelalCar.changeToGear(Car.Gear.NEUTRAL); //Sæt bilen i frigear

        DelalCar.Clutch(1); //Hvis den er i frigear, så tryk koblingen ned

        DelalCar.changeToGear(Car.Gear.FIRST); //Skift gear til 1

        DelalCar.Clutch(0); //Slip koblingen

        DelalCar.Accelerate(1); //Tryg gaspedalen (blødt)
        System.out.println("The car is now driving in 1. gear");
    }

}
