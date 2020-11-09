import java.awt.*;

public class Saab95 extends Car {

    public boolean turboOn;

    //Constructor
    public Saab95() {
        super(2, 125, Color.red, "Saab95");
        turboOn = false;
        stopEngine();
    }

    //Saab95's "own" methods
    public void setTurboOn() {
        turboOn = true;
    }
    public void setTurboOff() {
        turboOn = false;
    }

    //Methods that must be implemented (from Car)
    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }
    public void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }
    public void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
}
