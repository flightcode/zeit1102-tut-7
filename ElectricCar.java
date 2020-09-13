public class ElectricCar extends Car {
    private String rego;
    private float speed;
    private String colour;
    private float charge;

    public ElectricCar() {
    }

    public ElectricCar(String rego, float speed, String colour, float charge) {
        this.rego = rego;
        this.speed = speed;
        this.colour = colour;
        this.charge = charge;
    }

    public void setCar(String rego, float speed, String colour, float charge) {
        this.rego = rego;
        this.speed = speed;
        this.colour = colour;
        this.charge = charge;
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

    public void setCharge(float charge) {
        this.charge = charge;
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

    public float getCharge() {
        return this.charge;
    }

    public void accelerate(float change) {
        if (change > 0) {
            if (speed < this.charge) {
                this.charge -= change;
            } else {
                this.charge = 0;
            }
            this.speed += change;
        }
    }

    public void decelerate(float change) {
        if (change > 0) {
            this.speed -= speed;
            this.charge += speed;
        }
        if (this.speed < 0) {
            this.charge += this.speed;
            this.speed = 0;
        }
    }

    public String toString() {
        return "Rego: " + this.rego + "\nSpeed: " + this.speed + "\nCharge: " + this.charge + "\nColour: "
                + this.colour;
    }
}
