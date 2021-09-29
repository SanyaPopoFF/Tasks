package epam.Collections.Planes;

public class Plane {

    private String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public void setMaxFlightDistance(int maxFlightDistance) {
        this.maxFlightDistance = maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
            "model='" + model + '\'' +
            ", maxSpeed=" + maxSpeed +
            ", maxFlightDistance=" + maxFlightDistance +
            ", maxLoadCapacity=" + maxLoadCapacity +
            '}';
    }
}
