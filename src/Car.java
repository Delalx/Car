import java.time.LocalTime;

public class Car {

    private final String password;
    public boolean engineOn;

    Car() {
        this.password = "password1234";
        this.engineOn = false;
    }

    public void turnEngineOn(CarKey key) {
        if (key.password.equals(password)) {
            System.out.println("The car engine is on");
            engineOn = true;
        } else {
            System.out.println("The car engine cannot be turn on, because of wrong key");
        }
    }

    public void Handbrake(boolean Handbrake) {
        if (Handbrake) {
            System.out.println("The handbrake is down");
        }
        else {
            System.out.println("The handbrake is up, so you can't drive");
            System.exit(0);
        }
    }

    /* Her er den originale:
    public void changeToGear(int gear) {
        if (gear == 1) {
            System.out.println("The car is in 1. gear");
        }
        if (gear == 2) {
            System.out.println("The car is in 2. gear");
        }
        if (gear == 3) {
            System.out.println("The car is in 3. gear");
        }
        if (gear == 4) {
            System.out.println("The car is in 4. gear");
        }
        if (gear == 5) {
            System.out.println("The car is in 5. gear");
        }
        if (gear == -1) {
            System.out.println("The car is in reverse");
        }
        else if (gear == 0) {
            System.out.println("The car is in neutral");
        }
    }*/
    enum Gear {
        REVERSE,
        NEUTRAL,
        FIRST,
        SECOND,
        THIRD,
        FORTH,
        FIFTH;
    }
    public void changeToGear(Gear gear) {
        switch (gear) {
            case FIRST -> System.out.println("The car is in 1. gear");
            case SECOND -> System.out.println("The car is in 2. gear");
            case THIRD -> System.out.println("The car is in 3. gear");
            case FORTH -> System.out.println("The car is in 4. gear");
            case FIFTH -> System.out.println("The car is in 5. gear");
            case REVERSE -> System.out.println("The car is in reverse");
            case NEUTRAL -> System.out.println("The car is in neutral");
        }
    }

    public void Clutch(int clutch) {
        if (clutch == 1) {
            System.out.println("The clutch is fully pressed down");
        } else if (clutch == 0) {
            System.out.println("The clutch is not pressed down");
        }
    }

    public void Accelerate(int Accelerator) {
        if (Accelerator == 0) {
            System.out.println("The accelerator is not pressed down");
        }
        if (Accelerator == 1) {
            System.out.println("The accelerator is softly pressed down");
        }
        else if (Accelerator == 2) {
            System.out.println("The accelerator is pressed fully down");
        }
    }

    public void Lights() {
        //Lyset skifter efter, hvad klokken er,
        int t = LocalTime.now().getHour();

        if (t >= 8 && t <= 18) {
            System.out.println("Driving lights is on");
        }
        else {
            System.out.println("The low beam is on");
        }
    }

}
