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

    public void accelerate(float speed) {
        if (speed >= 0) {
            if (speed < this.charge) {
                this.charge -= speed;
            } else {
                this.charge = 0;
            }
            this.speed += speed;
        }
    }

    public void decelerate(float speed) {
        if (speed >= 0) {
            if (this.speed > 0) {
                this.speed -= speed;
                this.charge += speed;
            }
        }
    }

    public String toString() {
        return this.rego + " " + this.colour + " " + this.speed + "km/h " + this.charge + "%";
    }
}
