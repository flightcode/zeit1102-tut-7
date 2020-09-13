public class Car {
    private String rego;
    private float speed;
    private String colour;

    public Car() {
        this.rego = "none yet";
        this.speed = -1.0f;
        this.colour = "none yet";
    }

    public Car(String rego, float speed, String colour) {
        this.rego = rego;
        this.speed = speed;
        this.colour = colour;
    }

    public void setCar(String rego, float speed, String colour) {
        this.rego = rego;
        this.speed = speed;
        this.colour = colour;
    }

    public void setRego(String rego) {
        this.rego = rego;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getRego() {
        return this.rego;
    }

    public float getSpeed() {
        return this.speed;
    }

    public String getColour() {
        return this.colour;
    }

    public void accelerate(float change) {
        if (change > 0) {
            this.speed += speed;
        }
    }

    public void decelerate(float change) {
        if (change > 0) {
            this.speed -= change;
        }
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    public String toString() {
        return "Rego: " + this.rego + "\nSpeed: " + this.speed + "\nColour: " + this.colour;
    }
}
